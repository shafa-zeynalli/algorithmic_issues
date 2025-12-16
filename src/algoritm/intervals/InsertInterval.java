package algoritm.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals =  {{1,3},{2,6},{8,10},{15,18}};
        int[] newInterval = {2,5};

        System.out.println(insert(intervals, newInterval));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length==0) return new int[0][0];

        List<int[]> l = new ArrayList<>();
        int i = 0;
        int n= intervals.length;

        while (i<n && intervals[i][1] < newInterval[0]){
            l.add(intervals[i]);
            i++;
        }

        while (i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.min(newInterval[1], intervals[i][1]);
            i++;
        }
        l.add(newInterval);

        while (i < n){
            l.add(intervals[i]);
            i++;
        }
        return l.toArray(new int[l.size()][]);
    }

}
