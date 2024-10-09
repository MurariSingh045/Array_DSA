public class Right_Rotation {
    public static void l_Rotation(int A[]){
        int temp = A[A.length -1];
        for(int i = A.length-1; i>0; i--){
            A[i] = A[i-1];
        }
          A[0] = temp;
          for(int x:A){
            System.out.print(x + " ");
          }
    }
    public static void main(String args[]){
       int A[] = {2,4,5,8,20,1,6};
       l_Rotation(A);

    }
    
}
