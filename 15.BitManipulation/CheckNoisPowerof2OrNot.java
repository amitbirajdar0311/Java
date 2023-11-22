
public class CheckNoisPowerof2OrNot {
    public static void main(String[] args){
        int n = 32;
        if((n&(n-1)) ==0){
            System.out.println("is a power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
    }    
}
