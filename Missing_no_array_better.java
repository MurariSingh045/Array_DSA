public class Missing_no_array_better {
    public static int misNum(int arr[] ,int n){
        int Hash[] = new int[n+1];
          // storing the frequencies:
        for(int i=0; i<n-1; i++){
            Hash[arr[i]]++;
        }
         //checking the freqencies for numbers 1 to N:
        for(int i =1; i<n; i++){
            if(Hash[i] == 0){
                return i;
            }
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5};
        int n = 5;
        System.out.println(misNum(arr, n));
    }
    
}
