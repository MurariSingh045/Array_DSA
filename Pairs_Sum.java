public class Pairs_Sum {
    public static void getPairsCount(int numbers[] , int sum){
        int count = 0;
        for(int i =0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length; j++){
              if((numbers[i] + numbers[j] == sum)){
                count++;
              }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int numbers[] = { 1, 5, 7,-1, 3, 3};
        int sum = 6;
        getPairsCount(numbers, sum);
        
    }
    
}
