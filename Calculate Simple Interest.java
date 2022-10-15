import java.util.Scanner ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc= new Scanner(System.in);
     int p=sc.nextInt();
          float r=sc.nextFloat();
       int t= sc.nextInt();
		int si=(int)(p*r*t)/100;
        System.out.println(si);
	}
}
