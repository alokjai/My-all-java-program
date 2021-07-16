class A
 {    
 A getA() 
   {         
     return this;  
    }   
 void msg() 
  {     
    System.out.println("Hello java");  
   } 
 }
 class Test2
 {    
 public static void main(String args[]) 
  {    
   new A().getA().msg();   
   }                                                     
 }  


 /*   A a=new A();|
     A b=a.getA();|  equal to   new A().getA().msg();
   b.msg();  */   |