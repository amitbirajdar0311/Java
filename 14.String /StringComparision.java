import java.util.*;
public class StringComparision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        if(str1==str2){
            System.out.println("str1 = str2");
        }
        else{
            System.out.println("not equal");
        }

        if(str1==str3){
            System.out.println("str2=str3");
        }
        else{
            System.out.println("not equal");
        }
        if(str1.equals(str3)){
            System.out.println("equals ");
        }
        else{
            System.out.println("not equals");
        }
    }
}
