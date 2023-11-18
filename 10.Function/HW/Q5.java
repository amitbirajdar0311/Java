package HW;
import java.util.*;
public class Q5 {
    public static void sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int last_digit = n%10;
            sum+=last_digit;
            n/=10;
        }

        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigit(n);
    }
}
