import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	
		int prev=1;
		int next=1;
		for(int i=2;i<n;i++)
		{
			int temp=prev+next;
			prev=next;
			next=temp;
		}
		System.out.println(next);

		
	}

}
