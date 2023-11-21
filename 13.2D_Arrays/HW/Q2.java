import java.util.*;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        int sum = 0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        System.out.println("Sum of all the elements in second row is " + sum);
    }
}
