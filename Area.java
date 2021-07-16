import java.util.*;

class Area
{
  int length, width,area;
  
    void setdim(int x,int y)
	{
		length = x;
		width = y;
	}
	
	int getarea()
	{
		area = length*width;
		return(area);
	}
	
    void display()
	{
	  int	area1 = getarea();
		System.out.println("area of  Rectangle : "+area1);
	}
	
	public static void main(String[] asd)
	{
		int x,y;
		Scanner input = new Scanner(System.in);
		System.out.println("Length = "+(x = input.nextInt()));
		System.out.println("width  = "+(y = input.nextInt()));
		Area rect = new  Area();
		 rect.setdim(x,y);
		 
		 rect.display();
	}
	
}