import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc=new Scanner(System.in);
         char ch = sc.next().charAt(0); 
        
        if(ch>='a' && ch<='z')
        {
            System.out.println("0");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("1");
        }
        else
        {
              System.out.println("-1");
        }
		
	}
}
