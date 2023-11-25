public class _2PrintNumbersfrom1toN {
    public static void print1toN(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }
       public static void main(String[] args){
        int n = 5;
        print1toN(n);
    }
}
