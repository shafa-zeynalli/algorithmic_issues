package algoritm.sliding_window_fixed_size;



//https://leetcode.com/problems/maximum-average-subarray-i/description/

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum=0, wSum=0;

        for (int i = 0; i < k; i++) {
            wSum+=nums[i];
        }
        maxSum=wSum;

        for (int i = k; i < nums.length; i++) {
            wSum += nums[i] - nums[i-k];
            maxSum=Math.max(maxSum,wSum);
        }
        return (double) maxSum / (double) k;
    }
}
