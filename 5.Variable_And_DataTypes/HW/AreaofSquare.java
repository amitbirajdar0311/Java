package HW;
import java.util.*;
public class AreaofSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        System.out.println("area of square is " + (side*side));
        sc.close();
    }
}
