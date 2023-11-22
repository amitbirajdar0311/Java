
public class CountSetBitInNumber {
    public static void main(String[] args){
        // int n = 15;
       

        //     int count = 0;
        // while(n>0){
        //     int last_digit = n%2;
        //     if(last_digit==1){
        //         count++;
        //     }
        //     n/=2;
        // }
        // System.out.println(count);


        // Method 2 : using bit manipulation 

            int n = 10; //1010
        int count = 0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n>>=1;
        }
        System.out.println(count);

    }    
}
