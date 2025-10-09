package algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length==0) return new int[0][];

        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        ArrayList<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i=1; i<intervals.length; i++){
            int[] next = intervals[i];

            if (current[1] >= next[0]){
                current[1] = Math.max(current[1],next[1]);
            }else {
                merged.add(current);
                current=next;
            }
        }
        merged.add(current);


        return merged.toArray(new int[merged.size()][]);
    }
}
