import java.util.*;
public class DiagnoalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int sum = 0 ;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){

        //             sum=sum + matrix[i][j];
        //         }
        //        else if((i+j) == matrix.length-1){
        //         sum+=matrix[i][j];
        //        }

        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //for primary diagonal
            sum+=matrix[i][i];

            // for secondary diagnoal  
            
            if(i!=(matrix.length-1-i)){
                sum+=matrix[i][matrix.length-1-i];
            }
        
        }

        System.out.println(sum);
    }

}
