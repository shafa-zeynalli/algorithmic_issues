package algoritm.stacks;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    public static String removeDuplicateLetters(String s) {
        int[] lCount=new int[26];
        boolean[] inStack = new boolean[26];

        for (char c: s.toCharArray()){
            lCount[c-'a']++;
        }

        Stack<Character> stack=new Stack<>();

        for (char c: s.toCharArray()){

            if (inStack[c-'a']){
                lCount[c-'a']--;
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > c && lCount[stack.peek()-'a'] > 0){
                char removed = stack.pop();
                inStack[removed-'a']=false;
            }

            stack.push(c);
            inStack[c-'a']=true;
            lCount[c-'a']--;
        }

        return stack.stream().map(Object::toString).collect(Collectors.joining());

    }
}
