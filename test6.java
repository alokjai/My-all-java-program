interface test6
{
	abstract void show();
	
	
	abstract void disp();
	
}

interface test7
{
	abstract void show();
	
	
	abstract void display();
	
}

 class tyu implements test6,test7
{
	public void show()
	{
		System.out.println("abstract here");
	}
	
	 public void display()
	 {
		System.out.println("test7 here"); 
	 }
	 
	  public void disp()
	 {
		System.out.println("test6 here"); 
	 }
}


class ert
{
	public static void main(String as[])
	{
		try
		{
		  Class c = Class.forName(as[0]);
		  test6 m = (test6)c.newInstance();
		  test7 g = (test7)c.newInstance();
		  
		  m.show();
		  m.disp();
          g.display();		  
		}
		catch(Exception e)
		{
			System.out.println("enter valid"); 
		}
	}
}