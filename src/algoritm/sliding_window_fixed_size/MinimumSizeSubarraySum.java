package algoritm.sliding_window_fixed_size;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE, wSum = 0, left=0;

        for (int right=0; right< nums.length; right++){
            wSum+=nums[right];

            while (wSum >= target){
                minLen=Math.min((right-left+1),minLen);
                wSum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
