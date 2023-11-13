import java.util.*;
public class TurnaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 3;
        String check = (a%2==0)?"Even":"Odd";
        System.out.println(check);
        sc.close();
    }
}
