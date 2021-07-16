class Animal
 {   
   void eat() 
   { 
     System.out.println("rtety");  
   }
 }
 class Dog extends Animal
 {
	 void bark() 
     { 
     	 System.out.println("gghjfg"); 
	 }
  }

class Puppy extends Dog
 {
	 void weep() 
     {
         System.out.println("weeping");
	 } 
 }

class TestInheritance2
  {
	  public static void main(String args[])
	  {
		  Puppy d = new Puppy();
		  d.weep();  
		  d.bark();
		  d.eat();    
	  } 
  }  