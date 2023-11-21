import java.util.*;
public class PrintLargestString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruits[] = {"apple","mango","banana"};
        String large =  fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(large.compareTo(fruits[i]) <0){
                large = fruits[i];
            }
        }

        System.out.println("largest is " + large);
        
    }
}
