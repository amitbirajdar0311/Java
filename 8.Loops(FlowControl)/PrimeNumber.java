import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                a++;
                System.out.println("Not a prime number");
                
                break;
            }

            
        }
        
        if(a==0){
            System.out.println("prime Number");
        }

        
        sc.close();
    }
}
