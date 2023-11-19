import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //height of Bars
        int[] height = {4,2,0,6,3,2,5};
        
        //trapped Water = (Waterlevel - heightofbar)*width 
        // water level is min(leftmax,rightmax)

        int n = height.length;
        //crete leftmax arrray 
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        //Create rightmax array 
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }


        int trappedWater =0 ;
        for(int i=0;i<height.length;i++){
            trappedWater += (Math.min(leftmax[i],rightmax[i]) - height[i]);
        }

        System.out.println("trapped Water is " + trappedWater);
    }
}
