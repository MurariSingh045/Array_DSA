
public class LargestNumbers {
    public static int getLargestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){// smallest
                smallest = numbers[i];
            }
        }
        System.out.println("smallest no is :" +smallest);// coz only one return statement is used in function at a time
        return largest;

    }
    public static void main(String args[]){
        int numbers[] = { 1,3,4,6,7,2};
        System.out.println("largest number is :"+getLargestNumber(numbers));
    }
    
}
