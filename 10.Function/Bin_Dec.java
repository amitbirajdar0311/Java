import java.util.*;
public class Bin_Dec {
    public static void dec(int n){
        int pow = 0;
        int dec = 0;
     
        while(n>0){
       int last_digit = n%10;

            dec+= (int) ((int)last_digit*Math.pow(2,pow));
            pow++;
            n/=10;
        }

        System.out.println(dec);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();

        dec(bin);
    }
}
