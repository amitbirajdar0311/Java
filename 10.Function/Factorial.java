import java.util.*;
public class Factorial {
    public static void fact(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        sc.close();
    }
}
