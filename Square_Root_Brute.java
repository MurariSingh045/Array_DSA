public class Square_Root_Brute {
    public static int squareRoot(int n ){
        int ans = 1; // to store maximum no which might be square root
        for(int i = 1; i<=n; i++){
           if((i*i) <= n){
            ans = i; // find maximum no which is lesser than given number(n)
           }
           else {
            break; // if the square is greater than number then break it coz rest no number would be lesser 
           }
        }
        return ans;
    } // TC : O(N) // SC : O(1)
    public static void main(String args[]){
        int n = 28;
        System.out.println("The square root is : "+squareRoot(n));
    }
    
}
