public class quickSort {
    public static void main(String[] args){
        // Average Time: O(n * log(n)) | Worst Time: O(n^2) | Space: O(log(n)) call stack
        //Can be 2-3x faster than mergesort
        int[] nums = {7, 3, 4, 2, 0, 5, 6, 1};

        System.out.print("Before: ");
        for(int num: nums){
            System.out.print(num +" ");
        }

        // Start sorting the whole array from index 0 to the last index
        quickSort(nums, 0, nums.length - 1);
        System.out.println();
        System.out.print("After:  ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    static void quickSort(int[] nums, int start, int end){
        // Base case: if there is 1 or 0 elements left in this chunk, stop splitting
        if(end <= start) return;

        // Rearrange the chunk so smaller numbers are on the left of the pivot
        // and bigger numbers are on the right. 'pivot' gets the final index of that middle number.
        int pivot = partition(nums, start, end);

        // Sort all the numbers to the LEFT of the pivot (leave the pivot alone, it's already in the right spot!)
        quickSort(nums, start, pivot - 1);

        // Sort all the numbers to the RIGHT of the pivot
        quickSort(nums, pivot + 1, end);
    }

    static int partition(int[] nums, int start, int end){
        // Pick the last number in our current chunk as the 'pivot' (the number we compare everything to)
        int pivot = nums[end];

        // 'i' keeps track of the boundary for numbers smaller than the pivot.
        // It starts one step before our chunk begins because we haven't found any small numbers yet.
        int i = start - 1;

        // 'j' is our scanner: it walks through the chunk from 'start' up to the number right before the pivot
        for(int j = start; j < end; j++){
            // If the number at 'j' is smaller than our pivot, throw it into the "small numbers" zone on the left
            if(nums[j] < pivot){
                i++; // move the small-numbers boundary forward by one slot

                // Swap nums[i] and nums[j] so the small number gets locked into the left side
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Now all small numbers are packed cleanly from 'start' up to 'i'.
        // Move 'i' one step forward to the first slot of the "big numbers" zone.
        i++;

        // Swap the pivot (sitting at 'end') into slot 'i' so it sits right between the small and big numbers
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;

        // Tell quickSort where the pivot finally landed so it knows where to split next
        return i;
    }
}