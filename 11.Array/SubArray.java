
import java.util.*;
public class SubArray{

    public static void subArray(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println(" ");
            }


            System.out.println(" ");
        }
        System.out.println("Total number of subArray is " + count);
    }


    public static void maxSubArraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum +=arr[k];
                }
                max = Math.max(max,sum);

            }
        }


        System.out.println("max is " + max);
    }

    public static void maxSubArraySumPrefixsumMethod(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int current_sum =0;
                
                current_sum=(i==0)?prefix[j]: prefix[j] - prefix[i-1];
                max = Math.max(max,current_sum);


            }   
        }

        System.out.println("max is " + max);
    }


    public static void kadanesAlgo(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs =0 ;
            }

            ms = Math.max(ms,cs);
        }

        System.out.println("maximum sub array sum is " + ms);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr =  {2,4,6,8,10};
        // subArray(arr);
        // maxSubArraySum(arr);
        // maxSubArraySumPrefixsumMethod(arr);
        kadanesAlgo(arr);
    }
}
