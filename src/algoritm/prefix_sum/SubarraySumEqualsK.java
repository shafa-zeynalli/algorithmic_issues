package algoritm.prefix_sum;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums,2));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m =new HashMap<>();

        m.put(0,1);
        int prefixSum=0, count=0;

        for (int n : nums){
            prefixSum+=n;

            if (m.containsKey(prefixSum-k)){
                count += m.get(prefixSum-k);
            }

            m.put(prefixSum,m.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
