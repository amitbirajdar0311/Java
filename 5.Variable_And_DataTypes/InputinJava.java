import java.util.*;
public class InputinJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Retruns token i.e only one word even though we write a para he
        String a = sc.next();
        System.out.println(a);
        
                //intput a integer value
                int c = sc.nextInt();
                System.out.println(c);

       

        // input a float value 
        float d = sc.nextFloat();
        System.out.println(d);

        //input a long value 
        long e = sc.nextLong();
        System.out.println(e);

        // input a double value 
        double f = sc.nextDouble();
        System.out.println(f);

        // input a byte value 
        byte g  = sc.nextByte();
        System.out.println(g);

        //input a short value 
        short h = sc.nextShort();
        System.out.println(h);

        // input a boolean value 
        boolean i = sc.nextBoolean();
        System.out.println(i);
        sc.close();
    }
}
