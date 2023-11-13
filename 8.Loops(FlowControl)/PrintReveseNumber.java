public class PrintReveseNumber {
    public static void main(String[] args) {
        // int n = 10899;
        // while(n>0){
        // int last_digit = n%10;
        // System.out.print(last_digit);
        // n/=10;
        // }

        int n = 123456;
        int rev = 0;
        while (n > 0) {
            int last_digit = n % 10;

            rev = rev * 10 + last_digit;
            n /= 10;

        }

        System.out.println(rev);
    }
}
