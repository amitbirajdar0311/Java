import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] marks = new int[20];

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math
 
        System.out.println("Physics marks " + marks[0]);
        System.out.println("chem marks " + marks[1]);
        System.out.println("math marks " + marks[2]);


        marks[2] = 100;
        System.out.println("math updated marks "+ marks[2]);
        System.out.println(marks.length);

    }
}
