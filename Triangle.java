class Triangle
{
	int a,b,c,area,perimeter;
	
	
	 Triangle(int x,int y,int z)
	 {
		a = x;
        b = y;
        c = z;		
	 }
	 
	  int areatri()
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
		  int area1 = areatri();
		   int perimeter1= perim();
		   System.out.println("area triangle "+area1);
		   System.out.println("perimeter triangle "+perimeter1);
	     }	
	
	public static void main(String[] asd)
	{
		Triangle tr = new Triangle(3,4,5);
		 
		   
		tr.display();
	}
	
}