class TY2
{
	int x=10;
	
	int me()
	{
	   int x=20;
	   return x;
	}
	
	void show()
	{
		System.out.println(x);
	}
	
	public static void main(String[] as)
	{
		System.out.println(new TY2().me());
		TY2 t = new TY2();
		t.show();
		
	}
}