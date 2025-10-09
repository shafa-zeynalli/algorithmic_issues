package algoritm;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);


    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int current = target-nums[i];
            if(m.containsKey(current)){
                return new int[]{m.get(current),i};
            }else {
                m.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
