 import java.io.*;
 import java.net.*;
 import java.util.*; 
  public class Client
  {
    public static void main(String[] args)
	{  
	  Scanner input = new Scanner(System.in);
         //String M = "M";
		 //String F = "F";

          int pwd = 0;
	  int dup,dup2;
	 int ascii[] = new int[4];
	 String sn;
	 
   /* System.out.println("Give your name please!");
   
    String name = input.next();
	 System.out.println("Gender M or F");
	 String gen = input.next();
	  if(gen.compareTo(M)=0)
		  sn = "Sir";
	  if(gen.compareTo(F)=0)
	      sn = "Mam";
	  else
	   { 
           System.out.println("Invalid credential..!"); 
		    break;
	    }
    System.out.println("\n Hello! "+name+ " "+sn);  */
	System.out.println("\n Generate your passward press Only four number\n");		   
		try
		{
			Socket s = new Socket("localhost",6666);
			DataInputStream reply = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			 for(int i=0;i<4;i++)
	         {
		      ascii[i] = input.nextInt();
			  dout.write(ascii[i]);
		       }
	         System.out.println("Rquest send.....");
			
		
			  dup = (int)reply.read();
			 System.out.println("YOUR PASSWORD : "+dup);
			  System.out.println("\nPlease do First transaction");
			   System.out.println("Enter your passward");
               dup2 = input.nextInt();   //verify passward
              if(dup2==dup)
			  {
				  System.out.println("deposit amount");
				  
			  }         				 
			  dout.flush();
			  dout.close();
                         
			  s.close();
			  
		}
       catch(Exception e)
	   {
		   System.out.println(e);
	   }	   
	}
  }	
  
  