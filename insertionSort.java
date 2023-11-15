import java.util.* ;
import java.io.*; 

public class Solution {

	public static void insertionSort(int n , int[] arr) {
		// Write your code here.

for( int i=1;i<n;i++)
{
	int key=arr[i];
int j;
	for( j=i-1;j>=0;j--)
	{
		if(arr[j]>key)
		arr[j+1]=arr[j];
		else 
		break;
	}
	arr[j+1]=key;

}
}}
