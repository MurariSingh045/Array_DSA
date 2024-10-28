//import java.util.ArrayList;
public class Rearrange_Array_by_sign_opt {
    public static int[] rearrangeArray(int arr[] , int n){
        int posIndex = 0, negIndex = 1;  // create positive and negative indexes
      
     // create a Array
     int ans[] = new int[n];

     for(int i = 0; i<n; i++){
        // if the element is positive then store it on pos index
        if(arr[i] > 0){
            ans[posIndex] = arr[i];
            posIndex +=2;

        }

        // if the element is negative then store it on neg index
        else{
            ans[negIndex] = arr[i];
            negIndex +=2;
        }
     }

     // return Rearranged Array
     return ans;  // TC:O(N)  // SC:O(N)
     

    }
    public static void main(String args[]){
        int arr[] = {3, 1, -2, -5, 2, -4};
        int n = arr.length;
        int ans [] = rearrangeArray(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i]+ " ");
        }
    }
    
}
