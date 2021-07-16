import arithmatic.*;
import java.util.*;
class Arithmath
{
	public static void main(String[] assd)
	{
		Add a = new Add();
		Sub s = new Sub();
		Divide d = new Divide();
		Multiply m = new Multiply();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int c = in.nextInt();
		System.out.println("Enter second value");
		int b = in.nextInt();
		
		int add = a.plus(23.45);
		System.out.println(add);
		
		
	}
}
