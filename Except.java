import java.util.Scanner;
class Except
{
	
	public static void main(String[] as)
	{
		Scanner sc = new Scanner(System.in);
		//Except ex = new Except();
		
		System.out.println("Enter first value...");
		int a = sc.nextInt();
		System.out.println("Enter second value...");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum of number "+sum);
		int sub = a-b;
		System.out.println("Sub of number "+sub);
		
		
		try
		{
		  int divide = a/b;
            System.out.println("divide "+divide);		  
		}
		
        catch(NullPointerException P)
        {
			System.out.println("nullpointer exception here......");
		}

       /* catch(ArithmaticException s)
        {
			System.out.println("ArithmaticException here......");
		}*/			
		
		catch(NumberFormatException N)
        {
			System.out.println("NumberFormatException here......");
		}	
		
		catch(Exception e)
        {
			System.out.println("Exception here......");
		}

       int into = a*b;
		System.out.println("multiply "+into);		
	}
}