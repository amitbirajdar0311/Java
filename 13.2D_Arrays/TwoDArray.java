import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        //print a matrix 

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}