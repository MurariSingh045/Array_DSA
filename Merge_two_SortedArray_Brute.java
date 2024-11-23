public class Merge_two_SortedArray_Brute {

    public static void mergeTwoarray(int arr1[], int arr2[]){
        int n = arr1.length; // size of arr1
        int m = arr2.length; // size of arr2

        // create  a  new arr3 of size  (n+m)
        int arr3[] = new int[n+m];

        // use two pointers  
        int left = 0;
        int right  = 0;
        int index = 0;
         // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:
        while(left < n && right < m ){
         
            if(arr1[left] < arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }
            else{
                arr3[index]  = arr2[right];
                right++;
                index++;
            }
        }
         // If right pointer reaches the end:
         while( left < n){
            arr3[index] = arr1[left];
            left++;
            index++;
         }
         // if the left  pointers reaches the  end
         while(right < m){
            arr3[index++] = arr2[right++];
         }
         
        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for(int i = 0; i<n+m; i++){
            if(i < n){
                arr1[i] = arr3[i];
            }
            else{
                arr2[i-n] = arr3[i];
            }
        }
    }
    public static void main(String args[]){
        int arr1[] = {1, 3, 5, 7};
        int arr2[]  = {0, 2, 6, 8, 9};
        mergeTwoarray(arr1, arr2);
        System.out.println("Merge Two  Sorted Array");
        System.out.print("arr1[] = ");
        for(int x : arr1){
            System.out.print(x + "  ");
        }
        System.out.print("\narr2[] = ");
        for(int y : arr2){
            System.out.print(y + " ");
        }
        System.out.println();

    }
    
}
