import java.util.*;
public class Dec_Bin {

    public static void bin(int n){
        int bin = 0;
        int pow =0;
        while (n>0) {

            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            n/=2;
            pow++;
            
        }

        System.out.println(bin);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
System.out.println("Enter a deciamal number");
        int n = sc.nextInt();   
        bin(n);

    }
    
}
