package HW;
import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int even_sum = 0;
        int odd_sum = 0;
        int n;
        int choice;

        do{
            System.out.println("Enter a number");
            n = sc.nextInt();

            if(n%2==0){
                even_sum+=n;
            }
            else{
                odd_sum+=n;
            }

            System.out.println("Do you want to continue ? if Yes Press (1) and For No press (0)");

            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("EvenSum is " + even_sum);
        System.out.println("OddSum is " + odd_sum);
        sc.close();
    }
}