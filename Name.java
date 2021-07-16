import java.util.*;
class Name
{
	public static void main(String[] sdd)
	{
		String name,name2;
		Scanner in = new Scanner(System.in);
		
	    System.out.println(" enter first name");
		name = in.next();
		
		System.out.println(" enter second name");
		name2 = in.next();
		
		System.out.println(" comparing string........");
		
		if(name.equals(name2))
			System.out.println(" same name");
		else
			System.out.println(" not same");
		
		System.out.println(" first  name length :"+name.length());
		System.out.println(" second  name length :"+name2.length());
		
		System.out.println(" first  name UpperCase : "+name.toUpperCase());
		System.out.println(" second  name UpperCase : "+name2.toUpperCase());
		
	}
}
