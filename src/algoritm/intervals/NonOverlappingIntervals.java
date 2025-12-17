package algoritm.intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals =  {{1,2},{2,3},{3,4},{1,3}};

        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n=0;

        Arrays.sort(intervals,(a,b)->a[1] - b[1]);
        int[] curr=intervals[0];

        for (int i=1; i<intervals.length; i++){
            int[] next=intervals[i];

            if (curr[1] > next[0]){
                n++;
            }else  curr=next;
        }
        return n;
    }
}
