package algoritm.sliding_window_fixed_size;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
public class MaximumSumOfDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(nums,3));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();

        long maxSum=0, wSum=0;
        int left=0, n= nums.length;

        for (int right = 0; right < n; right++) {

            while (s.contains(nums[right])){
                s.remove(nums[left]);
                wSum-=nums[left];
                left++;
            }

            s.add(nums[right]);
            wSum+=nums[right];


            if (right-left+1 == k){
                maxSum=Math.max(wSum,maxSum);

                s.remove(nums[left]);
                wSum-=nums[left];
                left++;
            }
        }
        return maxSum;

    }
}
