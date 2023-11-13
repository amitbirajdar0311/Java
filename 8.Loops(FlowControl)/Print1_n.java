import java.util.*;
public class Print1_n {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while(a<=n){
            System.out.print(a+" ");
            a++;
        }
        sc.close();
    }
}
