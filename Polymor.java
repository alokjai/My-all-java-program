

class Polymor
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b,int c)
	{
		return a+b-c;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
	public static void main(String[] as)
	{
		Polymor demo = new Polymor();
		System.out.println(demo.add(4,3));
		System.out.println(demo.add(7,6,1));
		System.out.println(demo.add(4.7d,3));
	}	
}