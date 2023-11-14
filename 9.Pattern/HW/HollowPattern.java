import java.util.*;
public class HollowPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int k = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(i==1 || i==n || j==1 || j == k ){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }
            }

            System.out.println(" ");
        }
    }
}
