import java.util.*;
 class Box 
{

	static int area , volume;
	 
}

class Rectangle extends Box
{
	int length,width;
	
	Rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	 
	 void  Area()
	{
		 
		area = length*width;

		System.out.println("Area is "+area);
		
	}
	
	void Volume()
	{
		volume = 2*(length+width);
		
		System.out.println("Volume is "+volume);
	}
}

 class GiveValue
{
  public static void main(String ss[])
  {
	  Scanner in = new Scanner(System.in);
		System.out.println("Find area and volume of rectangle");
		System.out.println("Enter length");
		int length = in.nextInt();
		System.out.println("\nEnter width");
		int width = in.nextInt();
		
		Rectangle re = new Rectangle(length, width);
		
		re.Area();
		re.Volume();
  }
}