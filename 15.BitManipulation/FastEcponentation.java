
public class FastEcponentation {
    public static void main(String[] args){
        int a = 5;
        int n = 3; // 101 convert to binary 
        int ans  = 1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a*=a;
            n>>=1;
        }
        
        System.out.println(ans);
    }    

}
