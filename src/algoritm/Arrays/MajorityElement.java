package algoritm.Arrays;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majority = (nums.length / 2), result = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : nums){
            m.put(i,m.getOrDefault(i,0) +1);
            if (m.get(i) > majority) result=i;
        }
        return result;
    }
}
