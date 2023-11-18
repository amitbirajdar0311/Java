package HW;
import java.util.*;
public class Q1 {
    public static void avg(int a, int b, int c){
        System.out.println("average of three number is " + (a+b+c)/3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a,b,c);
    }
}
