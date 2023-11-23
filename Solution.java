import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 2, 4, 6, 8, 10 };
    int current_sum = 0;
    int max_sum = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      current_sum+=arr[i];
      if(current_sum<0){
        current_sum = 0;
      }

      max_sum= Math.max(max_sum,current_sum);
    }
    
    System.out.println(max_sum);
  }
}