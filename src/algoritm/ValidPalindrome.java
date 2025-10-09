package algoritm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if(s.trim().isEmpty()) return true;
        String s1 = s.toLowerCase()
                          .replaceAll("[^a-zA-Z]", "");

        Deque<Character> newDeque = new ArrayDeque<>();

        for(char c: s1.toCharArray()){
            newDeque.push(c);
        }
        while(!newDeque.isEmpty()){
            if(newDeque.getFirst() == newDeque.getLast()){
                newDeque.pollFirst();
                newDeque.pollLast();
            }else{
                return false;
            }
        }
        return true;
    }
}
