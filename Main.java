
import java.util.Scanner;

public class Main 
{    // main method  
 public static void main(String args[])  
 {    
 Scanner sc = new Scanner(System.in);
   try    
    {      
	    int a[]=new int[10]; 
          
       System.out.println(a[12]);      
      
          try           
           {            
            System.out.println("Division");      
             int res = 100/ 0;           
            }        
          catch (ArithmeticException ex2)  
           {         
              System.out.println("Divide by zero is not allowed"); 
            }  
			
			System.out.println("2.)Input Format Exception");  
            System.out.println("Enter value...");
			
			 try           
           {            
            
		     int d = sc.nextInt();	
             int res = 100 + d;   
			 
            }        
          catch (NumberFormatException ex3)  
           {         
              System.out.println("Please give input number not character"); 
            }  
	}  
	catch (ArrayIndexOutOfBoundsException ex1)  
	{          
	      System.out.println("ArrayIndexOutOfBoundsException");   
    }  
	
	catch (Exception exp)  
	{          
	      System.out.println("Exception here..");   
    }  
  } 
} 
	