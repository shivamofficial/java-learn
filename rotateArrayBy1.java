import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.

    //int k=1;
    //int n=arr.length;
       // ArrayList<Integer> a=new ArrayList<>();
int [] a = new int [n];
 int k=0;

        for(int i=1;i<n;i++){
a[k]=arr[i];
k++;
          

        }

        for(int i=0;i<1;i++){

          a[k]=arr[i];
k++;

        }

        return a;

    }
}
