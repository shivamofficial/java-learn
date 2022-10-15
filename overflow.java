class Simple{  
public static void main(String[] args){  
//Overflow  
int a=130;  
byte b=(byte)a;  
System.out.println(a);  
System.out.println(b);  
}}
// 130
// -126

int a=2147483647; // max value of int
int y=a+1; // max value sai jyada to overflow hoga
