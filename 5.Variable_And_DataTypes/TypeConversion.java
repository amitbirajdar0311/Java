
public class TypeConversion {
    public static void main(String[] args){
        // int --> float allowed 
        int a = 2;
        float b = a;
        System.out.println(b);

        // float --> int not allowed 

        // float c = 23.3;
        // int d  = c;

        // NOW we perform type casting 

        float d = 23.3f;
        int e = (int)d;

        System.out.println(e);

        // convring character to number 

        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }    
}
