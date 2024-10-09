public class Missing_n0_Opt1 {
    public static int misNum(int arr[] , int n){
        // calculating sum of n natural no
        int sum = n*(n+1)/2;
        int s2 = 0;
        //Summation of all array elements:
        for(int i = 0; i<n-1; i++){
            s2 += arr[i];
        }
        int missingnumber = (sum - s2);
        return missingnumber; 
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5};
        int n = 5;
        int ans = misNum(arr, n);
        System.out.println(" The missing no is :" +ans);
    }
    
}
