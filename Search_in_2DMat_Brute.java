public class Search_in_2DMat_Brute {

    public static boolean searchMatrix(int mat[][] , int target){
        int n = mat.length; // size of row
        int m = mat[0].length; // size of column
        
        // standard technique of searching in 2D array
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                // if the target found return true
                if(mat[i][j] == target){
                    return true;
                }
            }
        }
        return false ; // if the target is not found

        // TC : O(N*M) // SC : O(1)
    }
    public static void main(String args[]){
        int mat[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int target = 8;
        boolean ans = searchMatrix(mat, target);
        System.out.println(ans ? "true" : "false");
    }
    
}
