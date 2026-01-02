package algoritm.hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfMatchingSubsequences {
    public static void main(String[] args) {
        String[] s = {"a","bb","acd","ace"};
        System.out.println(numMatchingSubseq("abcde",s));
    }

    public static int numMatchingSubseq(String s, String[] words) {
//        int count=0;
//        for (String st: words){
//            int i=0, j=0;
//
//            while (i<s.length() && j<st.length()){
//                if (s.charAt(i) == st.charAt(j)){
//                    i++;
//                    j++;
//                }else{
//                    i++;
//                }
//            }
//            if (j==st.length()) count++;
//        }
//
//        return count;
        //bu time limited xetasi verdi



        List<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++)
            pos[i] = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for (String w : words) {
            int prev = -1;
            boolean ok = true;

            for (char c : w.toCharArray()) {

                List<Integer> list = pos[c - 'a'];

                int idx = upperBound(list, prev);

                if (idx == list.size()) {
                    ok = false;
                    break;
                }

                prev = list.get(idx);
            }

            if (ok) count++;
        }
        return count;
    }
    private static int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
