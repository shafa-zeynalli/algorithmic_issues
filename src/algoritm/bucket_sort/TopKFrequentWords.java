package algoritm.bucket_sort;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] sArr = {"i","love","leetcode","i","love","coding"};
        System.out.println(topKFrequent(sArr, 2));
    }
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> m = new HashMap<>();

        for (String s : words){
            m.put(s,m.getOrDefault(s,0)+1);
        }

        List<String>[] bucket = new List[words.length+1];
        for (int i =0; i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }

        for (var entry: m.entrySet()){
            int freq = entry.getValue();
            bucket[freq].add(entry.getKey());
        }

        List<String> l=new ArrayList<>();
        for (int i = words.length-1; i > 0; i--) {

            for (String s : bucket[i]) {
                if (k>0) {
                    l.add(s);
                    k--;
                }
            }
        }
        l.stream().sorted().toList();
        return l;
    }
}
