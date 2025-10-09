package algoritm;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementStr {
    public static void main(String[] args) {
//        String s = "lkmlksadbutsad";
//        System.out.println(strStr(s,"saf"));

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static int strStr(String haystack, String needle) {

        System.out.println(haystack.indexOf(needle));

        return 0;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";

        StringBuilder s= new StringBuilder();
        int minSize = strs[0].length();

        for (String str: strs){
            minSize=Math.min(minSize,str.length());
        }

        for (int i=0; i<minSize; i++){
            char currentChar =strs[0].charAt(i);
            boolean isCurrent = true;

            for (int k=1;k<strs.length;k++){
                if (currentChar!= strs[k].charAt(i)) {
                    isCurrent=false;
                    break;
                }
            }
            if (isCurrent) s.append(strs[0].charAt(i));
            else break;
        }

        return s.toString();
    }
}

