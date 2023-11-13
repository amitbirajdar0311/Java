package HW;
import java.util.*;
public class PositiveOrNegative {
        public static void main(String[] args){
            Scanner sc = new  Scanner(System.in);
            int n = sc.nextInt();
            if(n>=0){
                System.out.println("Number is positive");
            }
            else {
                System.out.println("Number is negative");
            }
            sc.close();
        }
}
