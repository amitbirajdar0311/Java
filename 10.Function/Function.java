import java.util.*;
public class Function{
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    // Sum function 

    public static int sum(int a , int b ){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        printHelloWorld();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println(sum);
    }
}