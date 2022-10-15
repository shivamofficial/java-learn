*******************************************************************************/
  
 // widening or automatic type conversion
public class Main
{
	public static void main(String[] args) {
	
		
		int i=12345345;
		
		long l=i;
		l=l+1;
		double d=l;
		
			System.out.println(i);
				System.out.println(l);
					System.out.println(d);
	}
}


...................//Explicit type casting ...................
  public class Main
{
	public static void main(String[] args) {
	
		
double d=25.1234;
//int i=d; // error dega
int i=(int)d;

byte b=(byte)i;

		
			System.out.println(i);
				System.out.println(b);
					System.out.println(d);
	}
}

