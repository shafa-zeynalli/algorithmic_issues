package algoritm;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s==null || t== null) return false;

        Map<Character,Integer> s1 = new HashMap<>();
//        Map<Character,Integer> t1 = new HashMap<>();

        for (char c: s.toCharArray()){
            s1.put(c, s1.getOrDefault(c,0)+1);
        }

        for (char c: t.toCharArray()){
            if (s1.containsKey(c) && s1.get(c) > 0) {
                s1.put(c, s1.getOrDefault(c, 0) - 1);
            }else {
                return false;
            }
        }

        return true;
    }
}
