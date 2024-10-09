public class sorted_array {
    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
              return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,6,8};
        System.out.println(isSorted(arr));
        
    }
    
}
