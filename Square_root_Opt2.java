import java.util.*;
import java.lang.Math;
public class Square_root_Opt2 {
    // using Math.sqrt() method
    public static int squareRoot(int n ){
        int ans = (int)Math.sqrt(n);
        return ans;
    }  // TC : O(logN) // SC : O(1)
    public static void main(String args[]){
        int n = 28;
        System.out.println("The square root is : "+squareRoot(n));
    }
}
