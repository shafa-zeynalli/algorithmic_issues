package algoritm.stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] arr={"2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s:tokens){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") ){
               int n2=stack.pop();
               int n1=stack.pop();
               int result=0;
               switch (s){
                   case "+" : result = n1 + n2; break;
                   case "-" : result = n1 - n2; break;
                   case "*" : result = n1 * n2; break;
                   case "/" : result = n1 / n2; break;
               }
               stack.push(result);
            }
            else stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }
}
