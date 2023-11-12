package HW;
import java.util.*;
public class Gst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        System.out.println("Total cost without GST is " + (pencil + pen + eraser));

        System.out.println("Total cost with 18% GST is " + ((pencil+pen+eraser)+ .18*(pen+pencil+eraser)));
        sc.close();
    }
}
