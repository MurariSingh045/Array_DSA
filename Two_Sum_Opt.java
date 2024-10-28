public class Two_Sum_Opt {
    public static int[] get2Sum(int arr[] , int n , int target){
      int left = 0, right = n-1;  // Two pointers

      // creating a new array of size 2
      int ans[] = new int[2];
       while(left < right){
        
        int sum = arr[left] + arr[right];
         
        // if sum greater than target then decrease right pointer by 1
        if(sum > target){
            right --;
        }

        // if sum lesser than target then increase left pointer by 1
        else if(sum < target){
            left ++;
        }

        // if sum == target then return thier indexes
        else{
            ans[0] = left;
            ans[1] = right;
            return ans;
        }
       }
       //  if sum not found then return ans
       return ans;  // TC :O(N) + O(N*logN)   // SC : O(1)
    }
    public static void main(String args[]){
        int arr[] = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;
        int ans[] = get2Sum(arr, n, target);
        System.out.println("[" +ans[0]+ "," +ans[1]+ "]");
    }
    
}
