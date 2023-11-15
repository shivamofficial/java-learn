import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
        // loop to access each array element
    for (int i = 0; i < n - 1; i++)
    
      // loop to compare array elements
      for (int j = 0; j < n - i - 1; j++)

        // compare two adjacent elements
        // change > to < to sort in descending order
        if (arr[j] > arr[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }

    }

}
