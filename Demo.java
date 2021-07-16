package rect;
import java.util.*;
class Login 
{
	private String name,pass;
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setpass(String pass)
	{
		this.pass = pass;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getpass()
	{
		return pass;
	}
}


public class Demo
{
	public static void main(String[] sd)
	{
		Login login = new Login();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name ");
		String d = in.next();
		login.setname(d);
		
		System.out.println("Enter pass ");
		String e = in.next();
		login.setpass(e);
		
		String nam = login.getname();
		System.out.println("name is "+nam);
		
		String pss = login.getpass();
		System.out.println("password is "+pss);
		
	}
}