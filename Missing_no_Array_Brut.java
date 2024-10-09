public class Missing_no_Array_Brut {
    public static int missingNumber(int arr[] , int n){
        // outer loop that run from 1 to N
        for(int i = 1; i<=n; i++){
            // flag variable check if the no exists or not
            int flag = 0;
            // checking no using linear Search
            for(int j = 0; j<n-1; j++){
                if(arr[j] == i){
                    //if the no exists
                    flag =1;
                    break;
                }

            }
            // // check if the element is missing
            //i.e flag == 0:
            if( flag == 0) return i;
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return-1;
    }
    public static void main(String args[]){
        int n = 6;
        int arr[] = {1, 2, 4, 5, 6};
        int ans = missingNumber(arr , n);
        System.out.println(" The missing no is :" +ans); 
    }
    
}
