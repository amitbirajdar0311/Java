import java.util.*;
public class GetBit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = 5; //00000101
        int pos = 3;
        int bitMask = 1<<pos;
        // if((n | bitMask)==n){
        //     System.out.println("bit is 1");
        // }
        // else{
        //     System.out.println("bit is 0");
        // }

        if((n&bitMask)==0){
            System.out.println("bit is 0");
        }
        else{

            System.out.println("bit is 1");
        }
        
    }
}
