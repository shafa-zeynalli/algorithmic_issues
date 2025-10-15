package algoritm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ValidPalindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "abb";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if(s.trim().isEmpty()) return true;
        char[] c = s.toLowerCase()
                .replaceAll("[^a-zA-Z]", "").toCharArray();

        int start=0, end=c.length-1;
        while (start < end){
            if (c[start] != c[end]) return false;
            start++;
            end--;
        }

        return true;
    }

//    public static boolean isPalindrome(String s) {
//        if(s.trim().isEmpty()) return true;
//        String s1 = s.toLowerCase()
//                          .replaceAll("[^a-zA-Z]", "");
//
//        Deque<Character> newDeque = new ArrayDeque<>();
//
//        for(char c: s1.toCharArray()){
//            newDeque.push(c);
//        }
//        while(!newDeque.isEmpty()){
//            if(newDeque.getFirst() == newDeque.getLast()){
//                newDeque.pollFirst();
//                newDeque.pollLast();
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
}
