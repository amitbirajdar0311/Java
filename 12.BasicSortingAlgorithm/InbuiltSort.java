import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String[] args){
        // int[] arr =  {3,1,2,5,4};

        // // in Incresing order 
        // // Arrays.sort(arr);
        // // Arrays.sort(arr, 0,3);


        Integer[] arr =  {3,1,2,5,4};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
}
