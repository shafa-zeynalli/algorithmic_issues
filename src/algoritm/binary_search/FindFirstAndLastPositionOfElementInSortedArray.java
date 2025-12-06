package algoritm.binary_search;


public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        searchRange(nums,8);
    }
    public static int[] searchRange(int[] nums, int target) {
        int left=0, right = nums.length-1;
        int[] arr = {-1,-1};


        while (left <= right){
            int mid = (right+left)/2;

            if (nums[mid]==target){
                 int n1=0, n2=0;
                 n1=mid;
                 if(nums[mid-1] == target) n2=mid-1;
                 if(nums[mid+1] == target) n2=mid+1;

                 arr[0]= Math.min(n1, n2);
                 arr[1]= Math.max(n1, n2);
                 return arr;
            }else if(nums[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return arr;
    }
}
