package algoritm.Arrays;

//https://leetcode.com/problems/single-element-in-a-sorted-array
public class SingleElementInASortedArray {

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;

        while (left < right){
            int mid = (left+right) / 2;

            if (mid%2==1 && nums[mid]==nums[mid-1]) left=mid+1;
            else if (mid%2==0 && nums[mid]==nums[mid+1]) left=mid+2;
            else right=mid;
        }
        return nums[left];
    }
}
