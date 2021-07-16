import java.util.*;

class Area1
{
  int length, width,area;
  
    Area1(int x,int y)
	{
		length = x;
		width = y;
	}
	
	int returnArea()
	{
		area = length*width;
		return(area);
	}
	
    void display()
	{
	  int	area1 = returnArea();
		System.out.println("area of  Rectangle : "+area1);
	}
	
	public static void main(String[] asd)
	{
		int x,y;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER Length & WIDTH ");
		
		Area1 rect = new  Area1(x = input.nextInt(), y = input.nextInt());
		 
		 rect.display();
	}
	
}