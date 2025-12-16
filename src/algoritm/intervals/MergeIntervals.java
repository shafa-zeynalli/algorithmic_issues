package algoritm.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length==0) return new int[0][0];

        Arrays.sort(intervals,(a,b)->a[0] - b[0]);

        List<int[]> l = new ArrayList<>();
        int[] curr = intervals[0];
        l.add(curr);

        for (int i=1; i < intervals.length; i++){
            int[] next = intervals[i];

            if (next[0] <= curr[1]){
                curr[1] = Math.max(next[1],curr[1]);
            }else{
                curr = next;
                l.add(curr);
            }

        }
        return l.toArray(new int[l.size()][]);
    }
}
