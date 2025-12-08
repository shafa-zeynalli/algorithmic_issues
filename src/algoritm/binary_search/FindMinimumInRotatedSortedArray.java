package algoritm.binary_search;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,0,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length-1;

        while (left < right){
            int mid = (left+right)/2;

            if (nums[right] < nums[mid]) {
                left = mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
