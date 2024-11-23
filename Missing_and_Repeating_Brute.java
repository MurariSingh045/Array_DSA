import java.util.*;
public class Missing_and_Repeating_Brute {

    public static List<Integer> missRepeat(int arr[]){
        int n = arr.length; // size of array
        int repeating = -1;
        int missing = -1;
        for(int i = 1; i<=n-1; i++){
            // count occurence 
            int cnt = 0;
            for(int j = 0; j<n; j++){
                if(arr[j] == i){
                    cnt++;
                }
            }
            if(cnt  == 2) repeating = i;
            else if (cnt == 0) missing = i;

            if(repeating != -1 && missing != -1) break;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans ;  // TC  : O(N*N) // SC : O(1)

    }
    public static void main(String args[]){
        int arr[] = {4, 3 ,6, 2, 1, 1};

        List<Integer> ans = missRepeat(arr);
        System.out.print(" The missing and  repeating  no are : [");
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.print("]");
    }
    
}
