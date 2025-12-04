package algoritm.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(arr));
    }
//    public static int[] dailyTemperatures(int[] temperatures) {
//        Map<Integer,Integer> m= new HashMap<>();
//        Stack<Integer> stack =new Stack<>();
//
//        for (int i=temperatures.length-1; i>=0; i--){
//            int count=0;
//            while (!stack.isEmpty() && stack.peek()<=temperatures[i]){
//                count++;
//                stack.pop();
//            }
//
//            int grather = stack.isEmpty() ? 0 : count;
//
//            m.put(temperatures[i], grather);
//            stack.push(temperatures[i]);
//        }
//
//        for (int i = 0; i < temperatures.length; i++) {
//            temperatures[i]=m.get(temperatures[i]);
//        }
//        return temperatures;
//    }
}
