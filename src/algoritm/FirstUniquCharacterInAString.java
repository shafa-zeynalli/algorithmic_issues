package algoritm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniquCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        Map<Character,Integer> newMap = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char c: chars){
            newMap.put(c, newMap.getOrDefault(c,0) +1);
        }
        for (int i=0; i<chars.length; i++){
            if(newMap.get(chars[i]) == 1) return i;
        }

        return -1;
    }
}
