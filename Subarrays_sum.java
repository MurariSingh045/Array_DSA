public class Subarrays_sum {
    public static void maxsubArrayssum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // outer loop
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += arr[k];
                }
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
