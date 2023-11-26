public class Solution{
  public static void main(String[] args){
    String dir = "WNEENESENNN";
    int x = 0;
    int y = 0;
    for(int i=0;i<dir.length();i++){
      char path = dir.charAt(i);
      if(path == 'E'){
        x++;r
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

    System.out.println("shortest path is " + Math.sqrt((x*x) + (y*y)));
  }
}