import java.util.*;
public class TrappedRain_water {
    public static int trappWater(int height[]){
        int n = height.length;
        // if no water is trapperd
        if(n == 0) return 0;

        // calculate left max boundary - In the form of array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i] ,leftmax[i-1]);
        } 

        // calculate right max - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i =0; i<n; i++){
            // water level = min(leftmax bound , rightmax bound)
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            // trapped water = water level - height
            trappedwater += waterlevel - height[i];
        }
        System.out.print(" Total trapped water vol is :");
        return trappedwater;

    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappWater(height));
    }
    
}
