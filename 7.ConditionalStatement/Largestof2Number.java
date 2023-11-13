import java.util.*;

public class Largestof2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1");
        int a = sc.nextInt();
        System.out.println("Enter your num2");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("num1 is > num2");
        }
        else if (a == b) {
            System.out.println("num1 = num2");
        } else {
            System.out.println("num2>num1");
        }

    }
}