import java.util.*;
public class PrintAllLettersinString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "I am Amit Birajdar";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
