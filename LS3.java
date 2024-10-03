public class LS3 {
    public static int LinearSearch(int numbers[], int k){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==k){
                return i;
            }
        }
        return -1; // it shows thar index not present if the index is not found then it will work
    }
    public static void main(String args[]){
        int numbers[] = { 2,3,4,6,7,8,9};
        int k = 10;
        // passing parameter in function
        int index = LinearSearch(numbers, k);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("the key is at index:" +index);
        }
    }
    
}
