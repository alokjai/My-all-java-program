class TriStatic
{
  static int a,b,c,area,perimeter;
  
	
	 TriStatic(int x,int y,int z)
	 {
		a = x;
        b = y;
        c = z;		
	 }
	 
  static int area()
	   {
		  area = (a*b)/2;
		  return(area);
	    }
		
  static int perim()
	   {
		 perimeter = a+b+c;
		  return(perimeter);
	    }
		
	 
	 
	static void display()
	    {
		   area = area();
		   perimeter= perim();
		   System.out.println("area triangle "+area);
		   System.out.println("perimeter triangle "+perimeter);
	     }	
	
	public static void main(String[] asd)
	{
		TriStatic tr = new TriStatic(3,4,5);
		 
		   
	     tr.display();
	}
	
}