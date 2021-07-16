


 class Dog extends Animals
 {
	protected void bark() 
     { 
     	 System.out.println("Barking"); 
	 }
 }

 class Puppy extends Dog
 {
	private void weep() 
     {
         System.out.println("weeping");
	 } 
 }

  class Animals
 {   
  public void eat() 
   { 
     System.out.println("Eating");  
   }
   
    public static void main(String args[])
	  {
		 
		  Puppy p = new Puppy();
		        
	      p.weep();
          p.bark();
		  p.eat(); 	 
		  
		  
	  } 
 }