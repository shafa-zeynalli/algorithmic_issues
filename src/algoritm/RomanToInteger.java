package algoritm;

//https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<>();

        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int sum =0;
        char[] c = s.toCharArray();

        int prev=0;
        for (int i=c.length-1; i>=0; i--){
            int curr=m.get(c[i]);

            if (curr >= prev){
                sum+=curr;
            }else{
                sum-=curr;
            }
            prev=curr;
        }

        return sum;
    }
}
