package algoritm.bucket_sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<>();

        for (char c : s.toCharArray()){
            m.put(c, m.getOrDefault(c,0) + 1);
        }

        List<Character>[] b = new List[s.length()+1];
        for (int i = 0; i < b.length; i++) {
            b[i] = new ArrayList<>();
        }

        for (var entry : m.entrySet()){
            int freq = entry.getValue();
            b[freq].add(entry.getKey());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = b.length-1; i >=1 ; i--) {
            for (char c:b[i]){
                sb.append(String.valueOf(c).repeat(i));
            }
        }

        return sb.toString();
    }
}
