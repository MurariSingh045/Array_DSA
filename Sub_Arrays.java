// Sub Arrays
public class Sub_Arrays {
    public static void subArrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) { // use for find start 
            int start = i;
            for (int j = i; j < arr.length; j++) {  // use for find end
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) { // use for print only
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                ts++;
                System.out.println("the sum is : " +sum);
                System.out.println();
            }
            System.out.println();

        }
        System.out.println(" Total Subarrays =" + ts);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArrays(arr);
    }

}
