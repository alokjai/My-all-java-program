
package ident;
public class Plot
{
	int length;
	int width;
	int hieght;
	int area;
	int volume;
	
    public Plot(int x,int y, int z)
	{
		length = x;
		width = y;
		hieght = z;
	}
	
	private void area1()
	{
	  area = length*width;
	  System.out.println(area);
	}
	
    public void volume1()
	{
		volume= length*hieght*width;
		System.out.println(volume);
	}
	
	public static void main(String[] sd)
	{
		Plot pie = new Plot(4,7,9);
		pie.volume1();
		//pie.area1();
	}
		
}

