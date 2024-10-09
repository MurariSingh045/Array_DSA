public class max_subarrays_sum {
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
                System.out.println(currSum);
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