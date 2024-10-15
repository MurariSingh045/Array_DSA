public class Move_Zero_end_Opt {
    public static int[] moveZero(int arr[], int n){
        int j = -1;
        for(int i =0; i<n; i++){  // TC:  O(x)
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // if no zero found
        if(j == -1) return arr;

        //Move the pointers i and j
        //and swap accordingly:
        for(int i = j+1; i<n; i++){  // O(n-x)
            if( arr[i] != 0){
            // Swap 0 & non Zero
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            }
        }
        return arr;    // TC: O(n)

    }
    public static void main(String args[]){
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] ans = moveZero(arr, n);
        for(int i =0; i<n; i++){
            System.out.print(ans[i] + " ");
        }

    }
    
}
