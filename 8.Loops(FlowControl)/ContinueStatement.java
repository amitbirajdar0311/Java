import java.util.*;
public class ContinueStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }

        // Q: Display all the Number Enterd by user except multiple of 10 

        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);

        }
    }
}
