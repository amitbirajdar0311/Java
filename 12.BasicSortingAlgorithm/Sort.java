public class Sort{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }


            arr[j+1] = current;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,3,1,5,4};
        // bubbleSort(arr);
        
        // selectionSort(arr);

        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");
    }
}