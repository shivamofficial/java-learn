public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here

        int n=size;
      for(int i=1;i<n;i++)
      {
          int temp=arr[i];
       int j=i-1;
       while(j>-1 && (arr[j]>temp))
       {
           arr[j+1]=arr[j];
           j--;
       }
arr[j+1]=temp;
      }
        
    }
}
