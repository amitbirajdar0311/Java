import java.util.*;
public class ShortestPath {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str = "WNEENESENNN";
        int x = 0, y  = 0;
        for(int i=0;i<str.length();i++){
            char path = str.charAt(i);
            if(path=='E'){
                x++;
            }
            else if(path=='W'){
                x--;
            }
            else if(path=='N'){
                y++;
            }
            else{
                y--;
            }
        }

        int a =(int)Math.pow(x,2) + (int)Math.pow(y,2);
        System.out.println("shortest distance is " + (int)Math.sqrt(a));
    }
}
