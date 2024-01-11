import java.util.*;
public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.

         int[] arr = new int[n];
        int[] brr = new int[n];
        int m = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                arr[m] = a[i];
                m++;
            } else {
                brr[k] = a[i];
                k++;
            }
        }

        // Combine the non-zero elements and zero elements
        int [] result=new int[m+k];
        for (int i = 0; i < m; i++) {
            result[i]=arr[i];
        }
        for (int j = 0; j < k; j++) {
            result[m+j]=brr[j];
        }

        return result;
    }
}
