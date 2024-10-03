    public class LinearSearch{ 
        public static int linear_Search(int numbers[], int key){

            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == key){
                    return i;    // if numbers is found in any index we return i
                }
            }
            return -1;   // if the index is not found we return -1



        }
        public static void main(String args[]){
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16};
        int key =10;
        int index = linear_Search(numbers, key);
        if(index ==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index:" +index);
        }
        }
    }
    
    
    