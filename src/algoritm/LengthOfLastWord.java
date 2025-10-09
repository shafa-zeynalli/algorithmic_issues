package algoritm;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return  arr[arr.length-1].length();

    }
}
