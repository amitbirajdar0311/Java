import java.util.*;
public class Fuction{
    public static void fact(int n){
        int factorization = 1;
        for(int i=1;i<=n;i++){
            factorization*=i;
        }

        System.out.println(factorization);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which we have to find a factor");
        int n = sc.nextInt();
        fact(n);
    }
}