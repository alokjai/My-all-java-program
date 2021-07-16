import java.util.*;

class Average1
{
	float avg;
	int x,y,z;
	
	Average1(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this();
	}
	
	Average1()
	{
		avg = (x+y+z)/3;
		System.out.println("AVERAGE = "+avg);
	}
	
	
	
	public static void main(String[] asd)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THREE VALUE");
		int a = input.nextInt();
		int s = input.nextInt();
		int d = input.nextInt();
		
		Average1 ave = new Average1(a,s,d);
		 
		
	}
}