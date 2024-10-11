public class Appear_once_nmbr_Opt {
    public static int appearOnce(int arr[]){
        int xor = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){  // coz same no of xor(a^a) give Zero(0) & (a^0) = a
            xor = xor^arr[i];
        }
        return xor;  // TC : O(N) , SC: O(1)
    }
    public static void main(String args[]){
        int arr[] = {1, 1, 2, 3, 3, 4, 4};
        int ans = appearOnce(arr);
        System.out.println(" the no appears once is :" +ans);
    
    }
    
}
