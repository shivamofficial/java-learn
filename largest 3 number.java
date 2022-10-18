import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
         int c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else
        {
            if(b>c)
            {
                     System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
		
	}
}
