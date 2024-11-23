import  java.util.*;
import java.util.Arrays;
public class Merge_two_SortedArray_Opt1 {

    public static void  mergeArray(int arr1[] , int arr2[]){
        int n = arr1.length; // length of arr1
        int m = arr2.length; // length of arr2

        // use two pointers
        int  left = n-1;
        int right =  0;

        while(left >= 0 &&  right < m){
            if(arr1[left] > arr2[right]){
                // swap arr1[left] & arr2[right]
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }

        // sort arr1 & arr2
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //TC : O(min(n, m)) + O(n*logn) + O(m*logm) // SC : O(1)

    }
    public static void main(String args[]){
        int arr1[] = { 1, 3, 5, 7};
        int arr2[] =  {0, 2, 6, 8, 9};
        mergeArray(arr1, arr2);
        System.out.println("Merge Sorted Array  with no gaps");

        System.out.print("[");
        // print each elements of  arr1
        for(Integer x : arr1){
            System.out.print(x + " ");
        }
        System.out.print("]");

        System.out.print("[");
        // print each element of arr2
        for(int y : arr2){
            System.out.print(y + " ");
        }
        System.out.print("]");
    }
    
}
