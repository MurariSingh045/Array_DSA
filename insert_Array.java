public class insert_Array {
    public static void main(String args[]){
        int A[] = new int[7];
        A[0] = 1; A[1] = 5; A[2] = 6;A[3] = 8;A[4] = 10;
        int n = 5;
        for(int i = 0; i<n; i++){
        System.out.print(A[i]+ " ");
        }
        System.out.println("");
         int x = 20;
         int index = 2;
           // Check if there's space to insert
        if (n >= A.length) {
            System.out.println("Array is full, cannot insert.");
            return;
        }
         // Shift elements to the right to make space for the new element
         for(int i=n; i>index; i--){
            A[i] = A[i-1];
         }
          // Insert the new element
            A[index] = x;
            // Increment the number of elements
            n++;
            //print the updated array
        for(int i = 0; i<n; i++){
            System.out.print(A[i] + " ");
            }
            System.out.println();

    }
    
}
