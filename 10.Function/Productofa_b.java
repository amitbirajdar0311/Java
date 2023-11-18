import java.util.*;
public class Productofa_b {
    public static void product(int a ,int b){
        System.out.println(a*b);
        return;

    }

    public static int multi(int a ,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a,b);

        int prod = multi(a,b);
        System.out.println(prod);
        sc.close();
    }
}
