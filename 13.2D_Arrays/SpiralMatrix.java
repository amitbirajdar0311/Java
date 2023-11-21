import java.util.*;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] matrix){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow <= endrow  && startcol <=endcol){
            // for top  startrow is fixed 
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            // for right endcol is fixed 
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            // for bottom  ening row is fixed 
            for(int j=endcol-1 ;j>=startcol;j--){

                if(startrow == endrow){
                    return;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //for left starting col is fixed 

            for(int i=endrow-1;i>=startrow+1;i--) {
                if(startcol == endcol){
                    return;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = 4;
        int col = 4;
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // print the matrix 
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

        printSpiralMatrix(matrix);
    }
}
