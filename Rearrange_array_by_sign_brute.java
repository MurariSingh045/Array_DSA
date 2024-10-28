import java.util.ArrayList;
public class Rearrange_array_by_sign_brute {
    public static int[] rearrangeArray(int arr[] , int n){

        // create 2 ArrayList one for positive and another for negative for store elements
        ArrayList<Integer> pos = new ArrayList<>();  // store positive elements
        ArrayList<Integer> neg = new ArrayList<>(); // store negative elements

        // iterate the entire array
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){  // if element is pod then store it on positive array
               pos.add(arr[i]);
            }
            else neg.add(arr[i]);  // if the element is neg then store it on negative array
        }

        // Rearrange Array by sign(alternative  + , -)

        for(int i = 0; i<n/2; i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }

        // return rearrange Array
        return arr;   // TC: O(N) + O(N/2)   // SC:O(N) - coz we are using extra space 


    }
    public static void main(String args[]){
        int arr[] = {3, 1, -2, -5, 2, -4};
        int n = arr.length;
        int ans[] = rearrangeArray(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print( ans[i] + " "); 
        }
    }
    
}
