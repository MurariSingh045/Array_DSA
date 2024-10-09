public class LeftRotating_Array {
    public static void Rotate(int A[]){
        // left Rotating the array by one place
        int temp = A[0];
        for(int i=1; i<A.length; i++){
          A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        for( int x:A){
            System.out.print(x);
        }
    }
    public static void main(String args[]){
        int A[] = {2,4,5,6,8,10,3,15};
        Rotate(A);  // calling the Rotate function
    }
    
}
