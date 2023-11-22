    import java.util.*;
    public class Solution{
        public static void main(String[] args){
          int n = 7;
          int bin =0;
          int pow =0;
          while(n>0){
            int last_digit = n%2;
            bin = bin +(int)Math.pow(10,pow)*last_digit;
            n/=2;
            pow++;
        
          }
          System.out.println(bin);

        }
    }