public class Peak_Element_LS {

    public static int findPeakelement(int arr[]){
        int n = arr.length; // Size of array.

        for (int i = 0; i < n; i++) {
            // Checking for the peak:
            if ((i == 0 || arr[i-1] < arr[i])
                    && (i == n - 1 || arr[i] > arr[i+1])) {
                return i;
            }
        }
        // Dummy return statement
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,5,1};
        System.out.println("The peak index is : " +findPeakelement(arr));
    }
    
}
