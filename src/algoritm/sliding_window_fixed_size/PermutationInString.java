package algoritm.sliding_window_fixed_size;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/description/

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ad","cbaebabacd"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] s1Count=new int[26], s2Count=new int[26];

        for (char c:s1.toCharArray()) s1Count[c-'a']++;

        int k=s1.length();
        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i)-'a']++;

            if (i>=k) s2Count[s2.charAt(i-k) - 'a']--;
            if (Arrays.equals(s1Count,s2Count)) return true;
        }
        return false;
    }
}
