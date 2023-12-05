import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem;
int oddsum=0;
int evensum=0;

while(n!=0)
{
	rem=n%10;
	if(rem%2==0)
	{
		evensum+=rem;
	}
	else{
		oddsum+=rem;
	}
	n=n/10;
}
System.out.println(evensum + " " + oddsum);

	}
}
