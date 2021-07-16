import java.util.*;
class Bank2
{
	static float balance, withdrawl, deposit;
	
   static void withdrawl()
    {
	 if(withdrawl<=balance)
	 {
	  System.out.println("WITHDRAWL SUCCESFULL WITH Rs. "+withdrawl);
      balance = balance-withdrawl;
	  System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
	  }
	 else
	 {
	  System.out.println("YOUR AMOUNT IS OVERFLOW OF YOUR BALANCE");
	  }
    }

   static void deposit()
	{
		System.out.println("\nWITHDRAWL SUCCESFULL WITH Rs. "+deposit);
	    balance = balance+deposit;
		System.out.println("\nYOUR CURRENT BALANCE IS : "+balance);
	}	
}

class Account2 extends Bank2
{
	public static void main(String[] as)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Amount");
		balance = input.nextFloat();
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
				 withdrawl();
				 break;
				
	     case(2):
               System.out.println("Enter Amount to deposit : ");
		        deposit = input.nextInt();
                  deposit();
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