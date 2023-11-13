import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter a operator");
        String operator = sc.next();

        switch(operator){
            case "+": System.out.println("num+num2 = " + (num1+num2));
            break;
            case "-":System.out.println("num1-num2 = " + (num1-num2) );
            break;
            case "*":System.out.println("num1*num2 = " + (num1*num2));
            break;
            case "/":System.out.println("num1/num2=" + (num1/num2));
            break;
            case "%":System.out.println("num1%num2=" + (num1%num2));
            break;
            default:System.out.println("Invalid Opeator");
        }
        sc.close();
    }
}
