import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
       Arrays.sort(arr);
List<int[]> al = new ArrayList<int[]>();

for(int i=0;i<arr.length-1;i++)
{
    for(int j=i+1;j<arr.length;j++)
    {
        if(arr[i]+arr[j]==s)
        {
          int temp[]=new int [2];
          temp[0]=arr[i];
          temp[1]=arr[j];
          al.add(temp);
        }
    }
}

return al;

    }
}
