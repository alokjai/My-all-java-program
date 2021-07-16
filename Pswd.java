
import java.util.*;

public class Pswd
{
  public static void main(String[] asd)
  {
	  int pwd = 0;
	  int dup;
	 int ascii[] = new int[4];
	 String sn;
	 
    System.out.println("Give your name please!");
    Scanner input = new Scanner(System.in);
    String name = input.next();
	 System.out.println("Gender M or F");
	 String gen = input.next();
	  if(gen=="M")
		  sn = "Sir";
	  else
		  sn = "Mam";
    System.out.println("\n Hello! "+name+ " "+sn);
	System.out.println("\n Generate your passward press Only four number\n");
	
	  for(int i=0;i<4;i++)
	  {
		  
		  ascii[i] = input.nextInt();
		  pwd = ascii[i]*100 + pwd;
      }
	  
       System.out.println("\n Your password is : "+pwd);
	   
	   System.out.println("\n For login please enter your passward");
	   dup = input.nextInt();
	   
	   if (dup==pwd)
	   { 
         System.out.println("You are succesfully login");
	   }
       else
	   { System.out.println(" Invalid credential");
        }		   
	   
		  
     	  
	 
	
  }
}  