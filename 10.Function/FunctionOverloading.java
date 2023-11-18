import java.util.*;
public class FunctionOverloading {
    // Functino to calculate sum of 2 numbers 

    public static int sum(int a ,int b){
        return a+b;
    }

    // Function to calculate sum of 3 numbers 

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum (float a , float b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(sum(2,3));
        System.out.println(sum(3,3,5));
        System.out.println(sum(2.3f,3.2f));
        sc.close();
    }
}
