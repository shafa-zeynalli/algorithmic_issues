package algoritm.hash_table;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Set<Integer> s = new TreeSet<>();

        for (int i: nums) {
            s.add(i);
        }

        int prev=Integer.MIN_VALUE,maxLength=0,length=0;

        for (var n:s){
            if (n==prev+1){
                length++;
            }else {
                length=1;
            }

            maxLength=Math.max(length,maxLength);
            prev=n;
        }
        return maxLength;
    }
}
