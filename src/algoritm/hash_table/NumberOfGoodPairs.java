package algoritm.hash_table;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arrs));
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if ( m.containsKey(nums[i]) ) k+=m.get(nums[i]);
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }
        return k;
    }
}
