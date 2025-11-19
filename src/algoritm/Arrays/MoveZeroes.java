package algoritm.Arrays;


//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);
        for (int i : nums){
            System.out.print(i + ",");
        }
    }

    public static void moveZeroes(int[] nums) {
        int left=0;

        for (int right=0; right < nums.length; right++){
            if (nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
