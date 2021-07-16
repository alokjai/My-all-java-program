// Test for primes. 
class FindPrime 
{   public static void main(String args[]) 
   {    
    int num; boolean isPrime = true;
      num = 7;
	  for(int i=2; i <= num/i; i++)
		{
			  if((num % i) == 0)
			  { 
		         isPrime = false;
            	  break; 
		      } 
	     } 
		  if(isPrime) System.out.println("Prime");
		  else System.out.println("Not Prime");
    }
}







// Using the comma. 
class Comma 
{
   public static void main(String args[]) 
   { 
      int a, b;
      for(a=1, b=4; a<b; a++, b--)
		  {
			  System.out.println("a = " + a); 
	          System.out.println("b = " + b); 
		  }
    }
}




// Parts of the for loop can be empty. 
class ForVar
 { 
   public static void main(String args[])
   { 
      int i;
      boolean done = false;
       i = 0; 
	   for( ; !done; )
		   {
			   System.out.println("i is " + i);
			   if(i == 10) done = true; 
			   i++;
		   }
    }
 }	
