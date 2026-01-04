package algoritm.prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums ={4,5,0,-2,-3,1};

        System.out.println(subarraysDivByK(nums,5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> m =new HashMap<>();
        m.put(0, 1);
        int prefix=0, count=0;

        for (int n : nums){
            prefix+=n;

            int rem = ((prefix % k) + k) % k;

            if (m.containsKey(rem)){
                count += m.get(rem);
            }
            m.put(rem,m.getOrDefault(rem,0)+1);

        }
        return count;
    }
}
