import java.util.*;
public class SetBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 10; //1010
        int pos = 2; 
        int bitMask = 1<<pos;
        int newNumberAfterSet = n | bitMask;
        System.out.println(newNumberAfterSet);
    }
}
