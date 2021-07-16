import java.util.*;
public class Box 
{

	static int area , volume;
	 
}

class Rectangle extends Box
{
	 
	 void  Area(int length,int width)
	{
		 
		area = length*width;
		//return area;
		System.out.println(area);
		
	}
	
	void Volume(int length,int width)
	{
		volume = 2*(length+width);
		//return volume;
		System.out.println(volume);
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
		
		Rectangle re = new Rectangle();
		
		re.Area(length, width);
  }
}