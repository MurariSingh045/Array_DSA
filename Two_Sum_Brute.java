public class Two_Sum_Brute {
    public static int[] get2Sum(int arr[] , int n , int target){
        // Declaring array of size 2  
        // coz we want only 2 nmbr
        int ans[] = new int[2];
        ans[0] = ans[1] = -1; // intialize value 
        
        // using neted loop
        for(int i = 0; i<n; i++){   // TC:O(N)
            for(int j = i+1; j<n; j++){   // TC:O(N)
                if((arr[i] + arr[j]) == target){
                    // if target found 
                    ans[0] = i; // put i into first index
                    ans[1] = j; // put j into second index
                    return ans;  // return the ans
                }

            }
        }
        return ans;   // if target not found return -1
        // TC:O(N*N)  // SC: O(1)
    }
    public static void main(String args[]){
        int arr[] ={ 2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14; 
       int ans[] = get2Sum(arr, n, target);
       System.out.println(" The 2 sum is :"+ "[" +ans[0] + " ," + ans[1] +"]");
    }
    
}
