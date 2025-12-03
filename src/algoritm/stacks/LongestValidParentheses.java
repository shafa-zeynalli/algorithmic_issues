package algoritm.stacks;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLength=0;
        stack.push(-1);
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='(') stack.push(i);
            else{
                stack.pop();

                if(stack.isEmpty()) stack.push(i);
                else maxLength=Math.max(maxLength, i-stack.peek());
            }
        }
        return maxLength;
    }
}
