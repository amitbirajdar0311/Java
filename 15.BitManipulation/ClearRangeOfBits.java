
public class ClearRangeOfBits {
    public static void main(String[] args){
        int n = 10;
       
        int i=2;
        int j=4;
        int bitMask = (~0<<j+1) | ~(~0<<i);
        System.out.println(bitMask &n);

        // int a = 0b100100000000;
        // System.out.println(a);

    }
}
