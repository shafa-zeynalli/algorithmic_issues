package algoritm;

public class ReverseInteger {
    public static void main(String[] args) {
        int a = -123;
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {

        long reversed = 0;

        while (x != 0){
            reversed = reversed * 10 + x%10;
            x/=10;
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE ) return 0;

        return (int)reversed;
    }
}
