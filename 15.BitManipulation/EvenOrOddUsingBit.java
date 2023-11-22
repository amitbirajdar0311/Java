import java.util.*;
public class EvenOrOddUsingBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        // int check = n
        if((n&1) ==0){
            System.out.println("Numbre is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
