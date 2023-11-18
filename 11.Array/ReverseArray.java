public class ReverseArray {
    public static void rev(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }

        System.out.println(" ");
    }
    public static void revOptimalMethod(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        rev(arr);
        revOptimalMethod(arr);
    }    
}
