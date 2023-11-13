import java.util.*;
public class BreakStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }

        //     System.out.print(i+" ");
        // }



        // Q. Keep Enter number util user enter multiple of 10 
    



        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }
            sc.close();
    }
    
}
