import java.util.*;
public class SubString {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str  = "HelloWorld";
        System.out.println(subString(str, 0, 5));

        // inbuilt method is also there to find subString 

        System.out.println(str.substring(0,5));
    }
}
