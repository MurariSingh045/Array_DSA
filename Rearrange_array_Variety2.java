import java.util.ArrayList;
public class Rearrange_array_Variety2 {
    public static int [] rearrangeArray(int arr[] , int n){

        // create pos & neg ArrayList 
        // positive ArrayList
        ArrayList<Integer> pos = new ArrayList<>(); // to store pos  element
        // Negative ArrayList
        ArrayList<Integer> neg = new ArrayList<>();  // to store neg element

        // iterate the entire array
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else neg.add(arr[i]);
        }
       // if positive element is greater than negative
        if(pos.size() > neg.size()){
            for(int i = 0; i<neg.size(); i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }

            // for rest of the positive element
            int index = neg.size() *2;
            for(int i = neg.size(); i<pos.size(); i++){
                arr[index] = pos.get(i);
                index++;

            }
        } 
        // if negative elements is greater than postive 
            else{
                for(int i = 0; i<pos.size(); i++){
                    arr[i*2] = pos.get(i);
                    arr[i*2+1] = neg.get(i);
                }
    
                // for rest of the negative element
                int index = pos.size() *2;
                for(int i = pos.size(); i<neg.size(); i++){
                    arr[index] = neg.get(i);
                    index++;
    
                }
            }
            // return Rearrange Array
            return arr; // TC:O(2N) // SC:O(N)
        
    }
    public static void main(String args[]){
        int arr[] = {-1 , 2, 3, 4, -3, 1};
        int n = arr.length;
        int ans [] = rearrangeArray(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
}
