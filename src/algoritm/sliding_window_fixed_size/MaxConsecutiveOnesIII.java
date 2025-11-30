package algoritm.sliding_window_fixed_size;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums,2));
    }
    public static int longestOnes(int[] nums, int k) {
        int maxLen=Integer.MIN_VALUE, left=0, zCount=0;

        for (int right=0; right< nums.length; right++){

            if (nums[right]==0) zCount++;

            while (zCount > k){
                if (nums[left]==0) zCount--;
                left++;
            }
            maxLen=Math.max((right-left+1),maxLen);
        }
        return maxLen;
    }
}
