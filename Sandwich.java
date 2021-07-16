import java.util.*;
abstract class Sandwich
{
	abstract void Add(int a, int b);
	abstract void Sub(int a, int b);
	int display(int x)
	{
		return(x);
		
	}
}


class Oil extends Sandwich
{
    void Add(int a, int b)
	{
    int c = a+b;
	System.out.println("Addition "+display(c));
	  
	}   
	  
	  
	 void Sub(int a, int b)
     {
	  int d = a-b;
	  System.out.println("substraction "+display(d));
	  
     }   
}

 class Cheez
 {
  public static void main(String[] as)
    {
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter first value");
	  int a = in.nextInt();
	  
	  System.out.println("Enter Second value");
	  int b = in.nextInt();
	
       Oil sand = new Oil();
       sand.Add(a,b);
       sand.Sub(a,b);   
  	  
   
    }  
 }
  
  
  
  