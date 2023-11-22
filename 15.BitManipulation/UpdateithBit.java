
public class UpdateithBit {
    public static int clearBit(int n, int pos){
        int bitMask  = 1<<pos;
        return n&(~bitMask);
    }
    public static int updateIthBit(int n,int pos , int newBit){
        int a = clearBit(n,pos);
        int bitMask = newBit<<pos;
        return bitMask | a;

    }
    public static void main(String[] args){
        int n = 10; //1010
        int pos =2;
        int newBit = 1;
        System.out.println(updateIthBit(n,pos,newBit));
    }    
}
