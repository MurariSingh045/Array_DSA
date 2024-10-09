public class Kadans_algo_SoS {
    public static void kadansAlgo(int arr[]){
        // initialize current sum(cs) & maximum sum(ms)
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        // iterate the array
        for(int i=0; i<arr.length; i++){
            cs += arr[i];  // iterate array and store it in cs
            if(cs < 0){  // check if the cs is negative the take 0 instead of negative value
              cs = 0;
            }
            ms = Math.max(cs,ms);  //
        }
        System.out.println("max sum is :" +ms);
    }
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadansAlgo(arr);

    }
    
}
