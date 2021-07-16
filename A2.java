//save by A2.java 
  package abc.dca.cca;
import balance.*;  
   class A2
  {  
   protected void msg() 
	{         
	  System.out.println("inside a2 ");  
	  }  
  }
  
  class Check
  {
	public static void main(String[] asd)
	  {
		  A2 ob2 = new A2();
		  ob2.msg();
		  
		  Account ac = new Account();
		  
		 ac.display_balance();
		  
	  }
  }