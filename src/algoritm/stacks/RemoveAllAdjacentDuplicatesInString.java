package algoritm.stacks;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char c: s.toCharArray()){
            if (!st.isEmpty() && st.peek()==c) st.pop();
            else st.add(c);
        }

        return st.stream().map(Object::toString).collect(Collectors.joining());
    }
}
