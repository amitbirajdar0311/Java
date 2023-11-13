package HW;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Day number");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wensday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("satarday");
                break;
            default:
                System.out.println("Invalid Entery");
        }
    }
}
