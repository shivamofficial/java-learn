
public class Main
{
	public static void main(String[] args) {
	int a=4;
	int b=5;
	
	int and=a&b; // both 1&1 =1 1&0=0  
	int or=a|b; // 1|0 =1 0|0=0
	
	int not=~a; // 1=0 0=1
	int xor=a^b; // 1^1=0 and 0^1=1 0^0=0  return 1 both different 
	System.out.println(and);
		System.out.println(or);
			System.out.println(not);
				System.out.println(xor);
				
				int leftshift=a<<2;
				int rightshift=a>>2;
					System.out.println(leftshift);
						System.out.println(rightshift);
				
	
	}
}

// output
4
5
-5
1
16
1
