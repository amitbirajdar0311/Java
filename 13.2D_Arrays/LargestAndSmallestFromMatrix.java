import java.util.*;
public class LargestAndSmallestFromMatrix {
    public static void largeAndSmallFromMatrix(int[][] matrix){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest,matrix[i][j]);
            }
        }

        System.out.println("largest element from matrix is "+ largest);
        System.out.println("Smallest element from matrix is "+ smallest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows");
        int row = sc.nextInt();
        System.out.println("Enter total number of columns");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }


        largeAndSmallFromMatrix(matrix);
     }
}
