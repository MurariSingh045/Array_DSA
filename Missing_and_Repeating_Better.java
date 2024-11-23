import java.util.*;
public class Missing_and_Repeating_Better {

    public static List<Integer> missRepeat(int arr[]){
     
        int n = arr.length; // size of an array

        //create a HashArray
        int Hasharray[] = new int[n+1];

         //update the hash array:
         for(int i = 0; i<n; i++){
            Hasharray[arr[i]]++;
         }
         
          //Find the repeating and missing number:
          int repeating = -1 , missing = -1;
          for(int i = 1; i<n; i++){
            if(Hasharray[i] == 2) repeating = i;
            else if(Hasharray[i] == 0) missing = i;

            if(repeating != -1 && missing != -1) break;
          }

          ArrayList<Integer> ans = new ArrayList<>();
          ans.add(repeating);
          ans.add(missing);
          return ans; // TC : O(2N) // SC  : O(N)
    }
    public static void main(String args[]){
        int arr[] = {4, 3, 6, 2, 1, 1};
        List<Integer> ans = missRepeat(arr);
         System.out.print("The  repeating and missing no are:");
         System.out.print("[");
        for(int i = 0; i<ans.size(); i++){
            System.out.print( ans.get(i) + " " );
        }
        System.out.print("]");
    }
    
}
