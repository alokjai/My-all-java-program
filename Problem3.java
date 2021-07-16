
// find the prime factor of given number

import java.util.*;

class Problem3
{
   public static void main(String[] args)
   {
     int a,b,c,i;
	 int fact[] = new int[20];
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter value ");
	 int val = input.nextInt();
      if(val%2==0)
	  {  
         a=2;
	   System.out.print(a+" ");
	  }
	  
	  if(val%3==0)
	  { 
          b=3;
	   System.out.print(b);
	  }
	 
	   for(i=1;i<=val;i++)
	   {
		 c = 6*i-1;
		 if(val%c==0)
			 fact[i-1] = c; 
		 
	    }
	 
	 for(i=0;i==fact.length;i++)
		 System.out.print(" "+fact[i]);
   }

}
