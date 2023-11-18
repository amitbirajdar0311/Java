import java.util.*;
public class PrimeorNot {
    public static boolean primeOrNot(int n){

        //corner cases
        if(n==2){
            return true;
        }
        
        for(int i=2;i<Math.sqrt(n)  ;i++){
            if(n%i==0){
              
               return false;
            }
        }



        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       System.out.println(primeOrNot(n));
        sc.close();
    }
}
