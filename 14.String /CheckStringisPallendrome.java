import java.util.*;
public class CheckStringisPallendrome {
    public static boolean checkPallendrom(String str){
        int start =0;
        int last = str.length()-1;
        while(start<last){
            if(str.charAt(start)!=str.charAt(last)){
                System.out.println("Not a pallendrome");
                return false;
            }
            start++;
            last--;
        }

        System.out.println("Is a pallendrome");
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkPallendrom(str);
    }
}
