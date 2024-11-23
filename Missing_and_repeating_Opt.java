import java.util.*;
public class Missing_and_repeating_Opt {
    public static int[] missandRepeat(int arr[]){
        int n = arr.length;

        //step .  S-SN 
        // S2 - S2N

        // sum of n natural no
        long SN = (n*(n+1))/2;
        //sum of sqaure of n natural no.
        long S2N = (n*(n+1)*(2*n+1))/6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for(int i =0; i<n; i++){
             S += arr[i]; // calculate sum of elements of array
             S2  += (long)arr[i]*(long)arr[i]; // calculate sum of square of elements of array
        }

        //S-Sn = X-Y:
        long val1 = S-SN;
        
        // S2-S2N
        long val2 = S2-S2N;
 
        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2/val1;
         //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;  // TC : O(N) // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {4, 3, 6, 2, 1, 1};

        int ans[] = missandRepeat(arr);
        System.out.println("The repeating and missing numbers are : { " + ans[0] + " ," + ans[1] + "}");
    }
    
}
