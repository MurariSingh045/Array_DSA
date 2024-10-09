public class Sum_of_array {   
       public static void main(String args[]){
        int A[] = {3,9,7,8,12,6,15,5,4,10};  // declaring an array
        int sum = 0;         // initialize sum as 0
        for(int i =0; i<A.length; i++){    // for loop used for traverse all elements present in array one by one.
            sum +=A[i];
        }
        System.out.println("The sum of array is :" +sum);
    }
    
}
