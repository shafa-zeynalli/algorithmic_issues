package algoritm.Arrays;

//Array Reversal Pattern (3-step reverse)
//https://leetcode.com/problems/rotate-array/description/
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums,3);

        for (int i : nums){
            System.out.print(i + ",");
        }
    }

    public static void rotate(int[] nums, int k) {
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);
    }
    public static void reverse(int[] nums, int left, int  right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
