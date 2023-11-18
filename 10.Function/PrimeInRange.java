import java.util.*;
public class PrimeInRange {

    public static void isPrime(int n){
        boolean flag = true;
        if(n==1){
            flag = false;
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }


        if(flag ==true){
            System.out.print(n+" ");
        }
        return;
    }
    public static void primeInRange(int a, int b){
        for(int i=a;i<=b;i++){
            isPrime(i);

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        primeInRange(a,b);
        sc.close();
    }
}
