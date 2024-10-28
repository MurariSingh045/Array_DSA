import java.util.HashMap;

public class Two_sum_Bettter2 {
    public static int[] get2Sum(int arr[] , int n , int target){

        // creating array of size 2
        int ans [] = new int[2];
        ans[0] = ans[1] = -1;

        // creating a HashMap
        HashMap< Integer , Integer> mpp = new HashMap<>();

        for(int i = 0; i<n; i++){
            int num = arr[i];
            int moreneed = target -arr[i];
            if(mpp.containsKey(moreneed)){
            ans[0] = i;
            ans[1]  =  mpp.get(moreneed);
            return ans;
            }
            mpp.put(arr[i] , i);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = { 2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;
        int[] ans = get2Sum(arr, n, target);
        System.out.println("[" +ans[0]+ " ," +ans[1]+ "]");
    }
    
}
