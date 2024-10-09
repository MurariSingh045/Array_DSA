public class Missing_no_Opt2 {
    public static int misNum(int arr[] , int n){
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i=0; i<n-1; i++){
            XOR2 = XOR2^arr[i]; // XOR of array elements
            XOR1 = XOR1^(i+1); //XOR up to [1...N-1]
        }
        XOR1 = XOR1^n;     //XOR up to [1...N]
        return (XOR2^XOR1);   // the missing number
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5};
        int n = 5;
        int ans = misNum(arr, n);
        System.out.println(" The missin no is :" +ans);
    }
    
}
