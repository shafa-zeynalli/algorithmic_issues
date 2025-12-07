package algoritm.binary_search;


public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,2};
        searchRange(nums,2);
    }
    public static int[] searchRange(int[] nums, int target) {
        int left=0, right = nums.length-1;
        int[] arr = {-1,-1};


        while (left <= right){
            int mid = (right+left)/2;

            if (nums[mid]==target){
                int n1=0, n2=0;
                while(mid>=0 && nums[mid] == target) {
                    n2 = mid;
                    mid--;
                }
                arr[0]=n2;

                while (mid<nums.length && nums[mid] == target) {
                    n1=mid;
                    mid++;
                }
                arr[1]=n1;

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
