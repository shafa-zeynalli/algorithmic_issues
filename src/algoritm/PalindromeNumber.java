package algoritm;

//https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        char[] c = s.toCharArray();

        int start = 0, end = c.length-1;

        while (start < end){
            if (c[start] == '-') {
                start++;
                continue;
            }

            else if (c[start] != c[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
