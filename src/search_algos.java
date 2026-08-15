public class search_algos {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        //LINEAR SEARCH
        //time: O(n)
        //Space: O(1)
        int target=9;
        int index=linearsearch(target,nums);
        if(index==-1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at: "+ index);
        }
        //Binary search
        //Time: O(log n)
        //Space: O(1)
        //Requirement : array MUST BE SORTED
        //int index=Arrays.binarySearch(nums,target);
        //automatic java method to do binary search
        search_algos obj=new search_algos();
        int index2= obj.binarysearch(target,nums);
        if(index2==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at: " + index2);
        }
    }
    private static int linearsearch(int n,int[]nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n) {
                return i;
            }
        }
        return -1;
    }
    public int binarysearch(int target,int[] nums){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            int value=nums[middle];
            System.out.println("middle: "+value);
            if(value<target){
                low=middle+1;
            }
            else if(value>target){
                high=middle-1;
            }
            else{
                return middle;//target found
            }
        }
        return -1;//target not found
    }
}
