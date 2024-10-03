
public class ls {
    public static  int linear_Search(int numbers[] , int keys){  // creating a function where we are passing numbers and keys
     for(int i=0; i<=numbers.length; i++){  // (.length method()) is used to saerching the whole array from index (0 to n) 
        if(numbers[i]==keys){
            return i;     // if index found its return i
        }

     }
     return -1; // if index not found it returns -1 coz {(-1) index does not present in array}  
    }
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 5, 6, 7, 8 };  // creating an array
        int keys = 5;                        
        int index = linear_Search(arr, keys);  // 
        if(index == -1){                      // (-1) states that element not found at any index
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index :" + index);   // printing output when element found
        }
    }
    
}
