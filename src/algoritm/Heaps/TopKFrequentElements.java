package algoritm.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(topKFrequent(nums,2));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i: nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(
                (a,b) ->a.getValue() - b.getValue());

        for (var entry : m.entrySet()){
            heap.add(entry);

            if (heap.size() > k){
                heap.poll();
            }
        }

        int[] arr = new int[k];
        for (int i=0; i<k;i++){
            arr[i]=heap.poll().getKey();
        }

        return arr;
    }
}
