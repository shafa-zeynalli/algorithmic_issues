package algoritm.sliding_window_fixed_size;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
public class FindAllAnagramsInAString {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();

        int[] sCount=new int[26], pCount=new int[26];

        for (char c: p.toCharArray()) pCount[c-'a']++;

        int k=p.length();
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i)-'a']++;

            if (i>=k) sCount[s.charAt(i-k) - 'a']--;
            if (Arrays.equals(sCount,pCount)) l.add(i-k+1);
        }
        return l;
    }
}
