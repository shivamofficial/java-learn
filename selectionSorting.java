public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        int minindex=i; // suppose maaan liye 

        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[minindex])
            {
                minindex=j;
            }
        }
int smallnumber = arr[minindex];
arr[minindex]=arr[i];
arr[i]=smallnumber;


    }
    }
}
