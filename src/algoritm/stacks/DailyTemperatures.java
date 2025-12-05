package algoritm.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(arr));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack =new Stack<>();

        for (int i=n-1; i>=0; i--){

            while (!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }

            if (!stack.isEmpty()){
                res[i]=stack.peek()-i;
            }else {
                res[i]=0;
            }
            stack.push(i);
        }

        return res;
    }
}
