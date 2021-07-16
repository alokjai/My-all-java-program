class WE extends U
{	
    WE()
	{
		this(34);
	  System.out.println("s here");
	}
	
	WE(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] sd)
	{
        WE f = new WE();
	}
}


class U extends L
{
	
	U()
	{
		this(67);
		System.out.println("U here");
	}
	
	U(int r)
	{
		super();
		System.out.println(r);
	}
}


class L
{
	L()
	{
		System.out.println("L is here");
	}	
}