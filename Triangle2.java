class Triangle2
{
	int a,b,c,area,perimeter;
	
	
	 Triangle2(int a,int b,int c)
	 {
		this.a = a;
        this.b = b;
        this.c = c;		
	 }
	 
	  int area()
	   {
		area = (a*b)/2;
		return(area);
	    }
		
	   int perim()
	   {
		perimeter = a+b+c;
		return(perimeter);
	    }
		
	 
	 
	 void display()
	    {
		   this.area = area();
		    this.perimeter= perim();
		   System.out.println("area triangle "+area);
		   System.out.println("perimeter triangle "+perimeter);
	     }	
	
	public static void main(String[] asd)
	{
		Triangle2 tr = new Triangle2(3,4,5);
		 
		   
		tr.display();
	}
	
}