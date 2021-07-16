/* this: to pass as an argument in the method 
The this keyword can also be passed as an argument in the method.
 It is mainly used in the event handling. Let's see the example:*/

class S 
{      
  void m(S obj)   
  {          
   System.out.println("method is invoked" );  
  }    
  void p()  
  {          
    m(this);   
   } 
   
  public static void main(String args[]) 
   {         
     S s1 = new S();      
	 s1.p();   
   }
   
   } 