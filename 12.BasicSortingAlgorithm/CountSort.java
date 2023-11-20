public class CountSort {
    public static void main(String[] args){
        int[] arr = {3,2,5,4,1};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        //create a frequcey array 
        int[] count = new int[max +1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]] ++;
        }

        //create a sorted array 
        int j =0 ;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
