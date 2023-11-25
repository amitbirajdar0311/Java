public class _5PrintNthFibonacciNumber {
    public static void fibWithoutRec(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    public static int fibwithRec(int n){
        if(n==0 || n==1){
            return n;
        }
        
        return fibwithRec(n-1)+fibwithRec(n-2);
    }
    public static void main(String[] args) {

        // fibWithoutRec(10);
        System.out.println(fibwithRec(10));

    }

}
