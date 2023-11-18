import java.util.*;
public class LinearSearch{
    public static int LinearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }


        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7};
        int key =7;

        int index = LinearSearch(numbers,key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is found at index " + index);
        }

        
    }
}