import java.util.* ;
import java.io.*; 
class Solution {

public static void main(String args[]) {
 
 // Write code here
       Scanner s = new Scanner(System.in);
       int basic = s.nextInt();
       char grade = s.next().charAt(0); 
       
       double hra = 0.2*basic;
       double da = 0.5*basic;
       double pf = 0.11*basic;
       int allow;
       
    switch(grade)
    {
        case 'A':
            allow=1700;
            break;
            
            case 'B':
                allow=1500;
                break;
                default:
                allow=1300;
                
    };
    
       double totalSalary = basic + hra + da + allow - pf;
       long ts = Math.round(totalSalary);
 System.out.println(ts);
}
}







................using if else............
  import java.util.* ;
import java.io.*; 
class Solution {

public static void main(String args[]) {
 
 // Write code here
       Scanner s = new Scanner(System.in);
       int basic = s.nextInt();
       char grade = s.next().charAt(0); 
       
       double hra = 0.2*basic;
       double da = 0.5*basic;
       double pf = 0.11*basic;
       int allow;
       
       if(grade == 'A'){
           allow = 1700; 
       }
       else if(grade == 'B'){
           allow = 1500;
       }
       else{
           allow = 1300; 
       }
       double totalSalary = basic + hra + da + allow - pf;
       long ts = Math.round(totalSalary);
 System.out.println(ts);
}
}
	
