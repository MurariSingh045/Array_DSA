public class reverse_array_K_place_brut {
        public static void rotate(int arr[], int k , int n){

              k = k%n;
              // create a new temp array
            int [] temp =  new int[k];
            // storing elements in temp array
            for(int i = 0; i<k; i++){
                temp[i] = arr[i];
            }
            //  left rotating array
            for(int i = k; i<n; i++){
                arr[i-k] = arr[i];
            }
            // for putting the value from the temp to array
            for(int i =n-k; i<n; i++ ){
                arr[i] = temp[i-(n-k)];
            }
        }
        
        public static void main(String args[]){
            int arr[] = {1,3,5,7,8,9,10};
            int k = 4;
            int n = 7;
            rotate(arr,k,n);
           for(int i=0; i<n; i++){
             System.out.print(arr[i] + " ");
         }
        }
    
}
