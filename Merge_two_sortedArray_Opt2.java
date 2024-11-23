public class Merge_two_sortedArray_Opt2 {

    public static void swapIfgreater(int arr1[] , int arr2[] , int ind1 , int ind2){
        while( arr1[ind1] >  arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    //   using shell sort Approach
    public static void mergeTwoarray(int arr1[] , int arr2[]){

        int n = arr1.length; // length of arr1
        int m = arr2.length; // size of arr2

        int length = (n+m); // ength o bot array arr1 &  arr2
        
        // intial  gap
        int gap = (length/2) + (length % 2);

        while(gap > 0){
            //place two  pointers
            int left = 0;
            int right =  left  + gap;

            while(right < length){
                // case 1: left in arr1[]
                //and right in arr2[]:
                if(left < n && right >= n ){

                swapIfgreater(arr1, arr2, left, right-n);
                }
                 // case 2: both pointers in arr2[]:
                else if( left >=n){
                    swapIfgreater(arr1, arr2, left-n, right- n);
                }
                 // case 3: both pointers in arr1[]:
                else{
                    swapIfgreater(arr1, arr2, left, right);
                }
                left++;
                right++;
            }

             // break if iteration gap=1 is completed:
             if(gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap/2) + (gap%2);

            // TC : O((n+m)*log(n+m)) // SC :O(1)

        }

    }
    public static void main(String args[]){
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        mergeTwoarray(arr1, arr2);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for(int x : arr1){
            System.out.print(x + " ");
        }
        System.out.print("\narr2[] = ");
        for(int y : arr2){
            System.out.print(y + " ");
        }   
        System.out.println();
    }
    
}
