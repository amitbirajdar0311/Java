import java.util.*;
public class StringBuilders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Amit Birajdar");
        System.out.println(sb);

        // int a = 3;
        // String str  = Integer.toString(a);
        // System.out.println(a);

        // String str1 = "32";
        // int b  = Integer.parseInt(str1);
        // System.out.println(b);

        // Properties 
        // 1. charAt(i) 
        System.out.println(sb.charAt(0));
        // 2.  .setCharAt(index,value)  //replace value 
        sb.setCharAt(0,'B');
        System.out.println(sb);


        // 3.  .insert(index,value) 
        sb.insert(0,'P');
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

        sb.append(" is talended");
        System.out.println(sb);
        
        System.out.println(sb.length());

    
    }
}
