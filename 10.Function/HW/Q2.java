package HW;
import java.util.*;
public class Q2 {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        

        if(isEven(n)){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
