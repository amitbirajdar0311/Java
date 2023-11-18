package HW;

import java.util.*;

public class Q3 {
    public static void isPallendrome(int n) {
        int a = n;
        int rev = 0;
        while (n > 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n /= 10;
        }

        if (rev == a) {
            System.err.println("is pallendrome");
        }

        else {
            System.out.println("not a pallendrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPallendrome(n);
    }
}
