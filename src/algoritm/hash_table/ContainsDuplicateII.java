package algoritm.hash_table;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arrs = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(arrs,1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i]) && Math.abs(m.get(nums[i])-i) <= k) return true;
            m.put(nums[i], i);
        }
        return false;
    }
}
