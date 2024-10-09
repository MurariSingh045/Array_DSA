public class second_largest {
    public static void SCND_L(int A[]){
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i<A.length; i++){
           if(A[i]>max1){
            max2 = max1;   // if the value of A[i]>max1 the we copy the value of max1 into max2
            max1 = A[i];
           }
           else if(A[i] > max2  ){
            max2 = A[i];
           }
        }
       System.out.println(" The second largest element is :" +max2);
    }
    public static void main(String args[]){
        int A[] = { 2,8,3,15,5,12};
        SCND_L(A);
    }
    
}
