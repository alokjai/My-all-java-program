abstract class test5
{  
   int x =12;
	abstract void show();
	
	
	abstract void disp();
	
}

class tyu extends test5
{
	
	void show()
	{
		x = 34;
		System.out.println("abstract here");
		System.out.println(x);
	}
	
	 void disp()
	 {
		System.out.println("abstract disp here"); 
	 }
}


class ert
{
	public static void main(String as[])
	{
		try
		{
		  Class c = Class.forName(as[0]);
		  test5 m = (test5)c.newInstance();
		  
		  m.show();
		  m.disp();	
		}
		catch(Exception e)
		{
			System.out.println("enter valid"); 
		}
	}
}