//public class Reverse_copying {
       // public static int reverse(int arr[]){
            // int n = arr.length ;
            // int temp[] = new int[n];

            // for(int i = 0; i < n ; i++){
            //     temp[i] = arr[n-1-i];
            // }
            // return temp ;

    //    }
    //     public static void main(String args[]){
    //         int arr[] = {2,4,6,7};
    //        // System.out.print(reverse(arr));
    //        int n = arr.length ;
    //        int temp[] = new int[n];
        

    //        for(int i = 0; i < n ; i++){

    //            temp[i] = arr[n-1-i];

    //        }

    //      System.out.println(temp);
    //     }
    // }
  public class Reverse_copying{
    public static void rev(int arr[] , int B[]){
      int i = 0 ;
      while(i < arr.length){
        // B[i] = arr[arr.length - 1 - i];
         B[i] = arr[arr.length - 1 -i];
        i++ ;
      }

      for(int j = 0 ; j < B.length ; j++){
        System.out.print(B[j] + " ");
      }
      
    }
    public static void main(String args[]){
      int arr[] = {1,3,5,6};
      int B[] = new int[arr.length];
      rev(arr, B);
 

    //   static int[] reverse(int arr[] , int temp[]){
        
    //     for(int i = 0; i < arr.length; i++){
    //         temp[i] = arr[arr.length-1-i];
    //     //    return temp[i] ;
    //     }
    //      return temp ;
    // }
    // public static void main(String args[]){
    //     int arr[] = {2,4,6,7};
    //     int temp[] = new int[arr.length];
    //     reverse(arr,temp);
        
    //     for(int i = 0 ; i < temp.length ; i++){
    //         System.out.print(temp[i] + " ") ;
    //     }
    
    }
  }  

