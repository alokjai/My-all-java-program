class Box
{
	double width;
	double hieght;
	double depth;
	
	Box(double w, double h, double d)
	{
		width =w;
		hieght =h;
		depth = d;
	}
	
 public  String toString()
	{
		return "Dimension are " + width + " by " + hieght + " by " + depth;
	}
}

class ToStringdemo
{
	public static void main(String as[])
	{
	  Box b = new Box(10,12,14);
	  
	  System.out.println(b);
	   String s = "box " +b;
	  System.out.println(s);
	  
	  
	}
}