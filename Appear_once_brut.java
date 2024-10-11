public class Appear_once_brut {
    public static int getSingleElement(int arr[]){
        int n = arr.length;
        // Run loop to selecting element
        for(int i=0; i<n; i++){
            int num = arr[i];    // select element
            int cnt = 0;
            // find occurence using linear Search
            for(int j = 0; j<n; j++){
                if(arr[j] == num){
                    cnt ++;
                }
            }
            // if the occurence is 1 then return ans
            if(cnt == 1) return num;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println(" The single element is :" +ans);
    
    
    }
}