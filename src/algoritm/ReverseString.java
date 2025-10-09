package algoritm;

public class ReverseString {
    public static void main(String[] args) {
        char[] strArr = {'h','e','l','l','o'};
        reverseString(strArr);
    }

    public static void reverseString(char[] s) {
        if (s.length==0 || s==null) return;

        int left = 0, right = s.length-1;

        while(left <= right){
            char current = s[left];
            s[left] = s[right];
            s[right] = current;
            left++;
            right--;
        }
    }
}
