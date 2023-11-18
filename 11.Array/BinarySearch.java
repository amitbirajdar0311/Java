public class BinarySearch {
    public static int binSearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }

            else if(arr[mid]>key){
                end = mid -1;
            }

            else{
                start = mid +1;
            }


        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14};
        int key = 12;
        int index = binSearch(arr,key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is found at index " + index);
        }
    }
}
