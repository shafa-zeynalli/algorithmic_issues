package algoritm.twoPointersPattern;



//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

       nums = twoSum(nums,3);

        for (int i : nums){
            System.out.print(i + ",");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0, right=numbers.length-1;
        while (left<right){
            int sum = numbers[left] + numbers[right];
            if (sum==target) return new int[]{left, right};
            if (sum < target) left++;
            if (sum > target) right--;
        }
        return new int[]{-1,-1};
    }
}
