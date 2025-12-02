package algoritm.stacks;

import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c:s.toCharArray()){
            if (!stack.isEmpty() && c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.stream().map(Object::toString).collect(Collectors.joining());
    }
}
