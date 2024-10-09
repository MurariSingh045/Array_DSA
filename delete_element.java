public class delete_element {
    public static void Delete(int A[]){
        int n = A.length;
        for(int i =0; i<n; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        int index = 1;
        A[index] =0;
        for(int i =index+1; i<A.length; i++){
            A[i-1] = A[i];
        }
        n--;
        for(int i =0; i<n; i++){
            System.out.print(A[i]+ " ");
        }

    }
    public static void main(String args[]){
      int A[] = {2,5,4,6,8,19};
      Delete(A);
    }
    
}
