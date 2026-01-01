package algoritm.hash_table;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
    }

    public static String reorganizeString(String s) {
        Map<Character,Integer> m = new HashMap<>();

        for (char c:s.toCharArray()) {
            m.put(c,m.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> p =
                new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        p.addAll(m.entrySet());

        if(Math.ceil(s.length()/2.0)<p.peek().getValue()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (p.size() > 1) {
            Map.Entry<Character, Integer> first = p.poll();
            Map.Entry<Character, Integer> second = p.poll();

            sb.append(first.getKey());
            sb.append(second.getKey());

            first.setValue(first.getValue() - 1);
            second.setValue(second.getValue() - 1);

            if (first.getValue() > 0) p.offer(first);
            if (second.getValue() > 0) p.offer(second);
        }
        if (!p.isEmpty()) {
            sb.append(p.poll().getKey());
        }
        return sb.toString();
    }
}
