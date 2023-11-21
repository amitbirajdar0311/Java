import java.util.*;

public class SearchKeyin2DArray {

    public static boolean search(int[][] matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key is found at index " + "( " + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("key is not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Key that needs to be find");
        int key = sc.nextInt();
        search(matrix,key);

    }
}
