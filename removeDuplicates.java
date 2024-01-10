import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.

		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(arr.get(i));
		}
		int k=set.size();
		return k;
	}
}
