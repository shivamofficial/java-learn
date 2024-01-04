
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here

int temp;
        for(int i=0;i<n;i++) // round kitna chalega swap kaa
        {
for(int j=1;j<n-i;j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
        }
    }

}
