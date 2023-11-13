import java.util.*;
public class SumofFirstnNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 1;
        while(a<=n){
            sum+=a;
            a++;
        }

        System.out.println(sum);
        sc.close();
    }
}
