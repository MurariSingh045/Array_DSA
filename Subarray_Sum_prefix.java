public class Subarray_Sum_prefix {
        public static void maxsubArrayssum(int arr[]) {
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            // create prefix array
            int prefix[] = new int[arr.length];
            for(int i=1; i<arr.length; i++){
                prefix[i] = prefix[i-1] + arr[i];
            }
            // outer loop
            for (int i = 0; i < arr.length; i++) {
                int start = i;
                for (int j = i; j < arr.length; j++) {
                    int end = j;
                    currSum = start == 0?prefix[end] : prefix[end] - prefix[start -1];
                  
                    // print the sum of all sub array
                    System.out.println(currSum);
                    // here if the current sum is greater than max sum 
                    //then we put curr sum value in max sum if it is not the we will not update
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }
            System.out.println(" max sum is :" + maxSum);
        }
    
        public static void main(String args[]) {
            int arr[] = { 1, -2, 6, -1, 3 };
            maxsubArrayssum(arr);
        }
    
    }
    