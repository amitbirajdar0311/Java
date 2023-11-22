
public class ClearLastIBits {
    public static int clearLastIthBit(int n,int i){
        int bitMask = ~0<<i;
        return bitMask & n;
    }
    public static void main(String[] args){
        int n =  15; //1111
        int i = 2;
       System.out.println(clearLastIthBit(n,i)); //1100 

    }    
}
