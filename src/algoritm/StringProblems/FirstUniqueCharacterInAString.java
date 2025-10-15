package algoritm.StringProblems;


//https://leetcode.com/problems/first-unique-character-in-a-string/description

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leeltcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> m = new HashMap<>();
        char[] arr =  s.toCharArray();

        for (char c : arr){
            m.put(c, m.getOrDefault(c,0)+1);
        }
        for (int i=0; i<arr.length; i++){
            if(m.get(arr[i]) == 1) return i;
        }
        return -1;
    }
}
