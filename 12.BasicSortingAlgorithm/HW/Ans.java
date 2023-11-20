package HW;

import java.util.Collections;
import java.util.Arrays;

public class Ans {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int large =i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[large]<arr[j]){
                    large = j;
                }
            }
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;


        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current>arr[j]){
                arr[j+1] =arr[j];
                j--;
            }


            arr[j+1] = current;
        }
    }

    public static void countingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int[] count =  new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
                }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        countingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
