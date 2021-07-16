
// Understanding the problem without this keyword 
class Test { 
   int a; 
   int b;  
// Parameterized constructor 
  Test(int a, int b)
    {  
      	a = a;  
        b = b; 
	 } 
	 
	  void display() {  
	  //Displaying value of variables a and b 
	  System.out.println("a = " + a + "  b = " + b); 
	  }  
	  
	  public static void main(String[] args) 
	  { 
	    Test object = new Test(10, 20); 
	    object.display();
	  } 
	  
} 