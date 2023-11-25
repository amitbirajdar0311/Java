import java.util.*;
public class _1PrintNumbersfromNto1 {
    public static void printNto1(int n){
        //base case 
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = 10;
            // for(int i=n;i>=1;i--){
            //     System.out.print(i+" ");
            // }
                printNto1(n);



        }
}
