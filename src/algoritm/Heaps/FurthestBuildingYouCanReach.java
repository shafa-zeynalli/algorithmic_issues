package algoritm.Heaps;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        System.out.println(furthestBuilding(heights,10,2));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i< heights.length-1;i++){
            int diff = heights[i+1] - heights[i];

            if (diff > 0){
                minHeap.add(diff);
            }

            if (minHeap.size() > ladders){
                bricks-=minHeap.poll();
            }
            if (bricks <= 0){
                return i;
            }
        }
        return heights.length-1;

    }
}
