package algoritm.binary_search;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int left =0, right=nums.length-1, max=Integer.MIN_VALUE;

        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                max=Math.max(max,mid);
            }

            if (nums[mid] < nums[mid-1]) right=mid;
            else if (nums[mid] > nums[mid+1]) left=mid + 1;
        }

        return max;
    }
}
