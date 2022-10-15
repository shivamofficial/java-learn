
import java.util.Scanner; // use scanner class to take input from user
public class Main
{
	public static void main(String[] args) {
	// // Creating an object of Scanner class
	
	Scanner sc=new Scanner(System.in);
	
	// Read integer value from the user
	
	System.out.println("Enter first number :");
	int a=sc.nextInt();
	
	System.out.println("Enter second number :");
	int b=sc.nextInt();
	
	int c=a+b;
	System.out.println("sum of two number is " + c);
	}
}
// output is 
Enter first number :
10
Enter second number :
20
sum of two number is 30
