import shapes.*;
import java.util.*;
class MensMath
{
	public static void main(String[] assd)
	{
		Triang tri = new Triang();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Find area and volume of triangle");
		System.out.println("Enter base");
		int base = in.nextInt();
		System.out.println("Enter hieght");
		int hieght = in.nextInt();
		
		float area = tri.Area(base,hieght);
		System.out.println(area);
		
		
	}
}