public class lS2 {
    public static int LinearSearch( int numbers[], int key){
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
            
            }
            return -1;
        }
        public static void main(String args[]){
            int numbers[] = { 1, 2, 3, 4, 5, 6, 7};
            int key = 4;
            int index = LinearSearch(numbers, key);
            if( index== -1){
                System.out.println("not found ");
            }
            else{
                System.out.println(" the key at index:" +index);
            }
        }
    }
    
    

    

