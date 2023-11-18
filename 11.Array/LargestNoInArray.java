
public class LargestNoInArray {
    public static void maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println("max is " + max);
    }


    public static void minInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }

        System.out.println("min is " + min);
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        maxInArray(arr);
        minInArray(arr);
    }
}
