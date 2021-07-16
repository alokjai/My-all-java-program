import java.util.*;

class Bank
{
	static float balance, withdrawl, deposit;	
}

class Account extends Bank
{
	int n;
	Account()
	{
		 Scanner input = new Scanner(System.in);
		
	  System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
	  if(n==0)
	  System.out.println("\nYour current balance is not sufficient so credit balance");
         
	  n = input.nextInt();
	  balance = n;
	  System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
	  label:
	 while(true)
	  {	  
	    System.out.println("IF YOU WANT WITHDRAWL TYPE 1\n\nIF YOU WANT DEPOSIT TYPE 2\n\nFOR EXIT TYPE 3");
		 int i = input.nextInt();
		
		switch(i)
		{
			case(1):
			       System.out.println("Enter Amount to withdrawl : ");
			         withdrawl = input.nextInt();
					if(withdrawl<=balance)
					{
						System.out.println("WITHDRAWL SUCCESFULL WITH Rs. "+withdrawl);
						balance = balance-withdrawl;
						System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
						break;
					}
					else
					{
						System.out.println("YOUR AMOUNT IS OVERFLOW OF YOUR BALANCE");
						break;
					}
			case(2):
                    System.out.println("Enter Amount to deposit : ");
			         deposit = input.nextInt();
				
						System.out.println("\nWITHDRAWL SUCCESFULL WITH Rs. "+deposit);
						   balance = balance+deposit;
						System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
							break;
		    case(3):
			       System.out.println("\nTHANK YOU FOR VISITING");
			       break label;
		
            default :
                     System.out.println("invalid credential");			
                			
					
		}
		
	  } 
	  
	}
}





class Login
{
  public static void main(String[] asd)
  {
	 int pwd = 0;
	  int dup;
	 int ascii[] = new int[4];
	
	System.out.println("********************************WELCOME YOUR BANK**********************************\n");
	
	 System.out.println("FIRST YOU OPEN YOUR ACCOUNT IN HAPPY BANK");
    Scanner input = new Scanner(System.in);
	
	 System.out.println("Give your name please!");
   
    String name = input.next();
    System.out.println("\n Hello! "+name);
	System.out.println("\n Generate your passward press Only four number\n");
	
	 for(int i=0;i<4;i++)
	  {
		  ascii[i] = input.nextInt();
		  pwd = ascii[i]*100 + pwd;
      }
	    
   		System.out.println("\n Your password is : "+pwd);
		 System.out.println("\n For login please enter your passward");
	     dup = input.nextInt();
	  try
      {	  
	   
	   if (dup==pwd)
	   { 
         System.out.println("You are succesfully login");
		 Account account = new Account();
	   }
       else
	      { 
             System.out.println(" Invalid credential");
            }
	  }
	 catch(Exception e)
	 {
		 System.out.println("retry");
	 }	 
			
  }		
	
}