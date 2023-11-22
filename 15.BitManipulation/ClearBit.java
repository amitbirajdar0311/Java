import java.util.*;
public class ClearBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5; //101
        int pos = 2; 
        int bitMask = 1<<pos;
        int newNum = n&(~bitMask);
        System.out.println(newNum);
    }
}
