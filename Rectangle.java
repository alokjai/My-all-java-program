class Rectangle
{
  float length, width,area;
  
    Rectangle(float x,float y)
	{
		length = x;
		width = y;
	}
	
	float area()
	{
		area = length*width;
		return(area);
	}
	
    void display()
	{
	  float	area1 = area();
		System.out.println("area of  Rectangle : "+area1);
	}
	
	public static void main(String[] asd)
	{
		 Rectangle rect = new  Rectangle(4.5f,5.8f);
		 
		 rect.display();
	}
	
}