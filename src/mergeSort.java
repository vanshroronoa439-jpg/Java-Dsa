import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        //mergeSort: Recursively divide array in 2, sort, re-combine
        // Time Complexity: O(n * log(n)) | Space Complexity: O(n)

        // --- TEST 1: Physical Split Version (Easier to visualize) ---
        int[] num1 = {2, 4, 3, 1};
        System.out.println("Method 1 (Array Splitting):");
        System.out.println("Before: " + Arrays.toString(num1));

        mergeSort(num1);

        System.out.println("After:  " + Arrays.toString(num1));
        System.out.println("----------------------------------");

        // --- TEST 2: Index Pointer Version (Textbook / C-style) ---
        // We use a fresh unsorted array here because num1 is already sorted!
        int[] num2 = {6, 7, 2, 5, 0, 1, 3, 4};
        System.out.println("Method 2 (Index Pointers):");
        System.out.println("Before: " + Arrays.toString(num2));

        mergeSortR(num2, 0, num2.length - 1);

        System.out.println("After:  " + Arrays.toString(num2));
    }

    // =========================================================================
    // METHOD 1: PHYSICAL ARRAY SPLITTING (Creates left and right sub-arrays)
    // =========================================================================

    static void mergeSort(int[] num){
        int len = num.length;
        if(len <= 1) return; // Base case: an array of 1 element is already sorted, so stop splitting

        // Create two new empty arrays for the left half and right half
        int mid = len / 2;
        int[] lnum = new int[mid];
        int[] rnum = new int[len - mid];

        int i = 0; // tracks index in num (and lnum)
        int j = 0; // tracks index in rnum

        // Copy elements from num into lnum and rnum
        for(; i < len; i++){
            if(i < mid){
                lnum[i] = num[i]; // first half goes into left array
            }
            else{
                rnum[j] = num[i]; // second half goes into right array
                j++;
            }
        }

        mergeSort(lnum); // keep splitting the left side until length is 1
        mergeSort(rnum); // keep splitting the right side until length is 1

        // Merge the sorted left and right halves back into the original num array
        merge(lnum, rnum, num);
    }

    static void merge(int[] lnum, int[] rnum, int[] num){
        int llen = num.length / 2, rlen = num.length - llen;
        int i = 0, l = 0, r = 0; // i = slot in num, l = slot in lnum, r = slot in rnum

        // Compare the front elements of lnum and rnum, and put the smaller one into num
        while(l < llen && r < rlen){
            if(lnum[l] <= rnum[r]){ // <= keeps original order if two numbers are equal
                num[i] = lnum[l];
                i++;
                l++;
            }
            else{
                num[i] = rnum[r];
                i++;
                r++;
            }
        }

        // If rnum ran out first, copy whatever is left in lnum straight into num
        while(l < llen){
            num[i] = lnum[l];
            i++;
            l++;
        }

        // If lnum ran out first, copy whatever is left in rnum straight into num
        while(r < rlen){
            num[i] = rnum[r];
            i++;
            r++;
        }
    }

    // =========================================================================
    // METHOD 2: INDEX POINTERS (Uses low, mid, high on the same array)
    // =========================================================================

    static void mergeSortR(int[] num, int low, int high){
        // Keep splitting only if there are at least 2 elements between low and high
        if(low < high){
            int mid = (low + high) / 2; // find the middle index

            mergeSortR(num, low, mid);      // sort the left half (low to mid)
            mergeSortR(num, mid + 1, high); // sort the right half (mid+1 to high)

            mergeR(num, low, mid, high);    // merge both sorted halves together
        }
    }

    static void mergeR(int[] num, int low, int mid, int high){
        // Temporary array just big enough to hold the chunk we are merging right now
        int size = high - low + 1;
        int[] temp = new int[size]; // Fixed from C syntax (int temp[size]) to Java syntax

        int i = low;     // starts at the beginning of the left half
        int j = mid + 1; // starts at the beginning of the right half
        int k = 0;       // starts at 0 to fill up the temp array

        // Compare elements from the left half and right half, and put the smaller one into temp
        while(i <= mid && j <= high){
            if(num[i] <= num[j]){
                temp[k++] = num[i++];
            }
            else{
                temp[k++] = num[j++];
            }
        }

        // Copy any leftover numbers from the left half into temp
        while(i <= mid){
            temp[k++] = num[i++];
        }

        // Copy any leftover numbers from the right half into temp
        while(j <= high){
            temp[k++] = num[j++];
        }

        // Copy the sorted numbers from temp back into the exact right spot in num
        for(i = 0; i < size; i++){
            num[low + i] = temp[i]; // low + i shifts it to the right starting index in num
        }
    }
}