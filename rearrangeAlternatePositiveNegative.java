import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
         int n=a.length;
        int[] result = rearrangeAlternatePositiveNegative(a, n);
        return result;

    }


     public static int[] rearrangeAlternatePositiveNegative(int[] arr, int n) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

      
      for(int i=0;i<n;i++)
      {
   if(arr[i]>0) pos.add(arr[i]);
      else neg.add(arr[i]);
      }

      for(int i=0;i<n/2;i++)
      {
          arr[2*i]=pos.get(i);
          arr[2*i+1]=neg.get(i);
      }
       return arr;
    }
}
