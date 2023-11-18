import java.util.*;
public class BianomialCoeff {

    public static int fact(int n){
        int factorial =  1; 
        for(int i=1;i<=n;i++){
            factorial*=i;
        }

        return factorial;
    }
    public static int binCoeff(int n,int r){


        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_r = fact(n-r);
        return fact_n/(fact_r * fact_n_r);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(binCoeff(n,r));
    }
}
