public class sort_algos {
    public static void main(String[] args){
        int[] nums={7,5,3,6,1,2,0,4};
        bubbleSort(nums);
        System.out.println();
        insertionSort(nums);
        System.out.println();
    }
    static void bubbleSort(int[] num1){
        //bubbleSort= pairs of adjacent elements are compared, and swapped if not in order
        //Quadratic time: O(n^2),Space: O(1)
        // okay for small data set but terrible for larger data set
        int len=num1.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1-i;j++){
                if(num1[j]>num1[j+1]){
                    int temp=num1[j];
                    num1[j]=num1[j+1];
                    num1[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for(int i=0;i<len;i++){
            System.out.print(num1[i]+" ");
        }
    }
    static void insertionSort(int[] num2){
        //insertionSort= after comparing elements to the left
        //               shift elements to the right to make room to insert a value
        //Quadratic time: O(n^2),Space: O(1)
        //for small data set decent but for large dataset bad
        //Lesser steps than bubble sort, best case is O(n)
        int len=num2.length;
        for(int i=1;i<len;i++){
            int temp=num2[i],j=i-1;
            while(j>=0 && num2[j]>temp){
                num2[j+1]=num2[j];
                j--;
            }
            num2[j+1]=temp;
        }
        System.out.print("Sorted Array: ");
        for(int i=0;i<len;i++){
            System.out.print(num2[i]+" ");
        }
    }
}
