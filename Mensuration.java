interface NameofShape
{
  String name( String name)
  {
	  return name;
  }
} 


class Shape
{
   static String name;	
}

class Circle extends Shape
{
	double radius;
	
	Circle(double r, String n)
	{
	  	radius = r;
	     name = n;
	  double area = 3.14 * radius*radius;
      System.out.println("Area of circle " +area);	  
		 
	}
}

class Square extends Shape
{
	double side;
	
	Square(double s, String n)
	{
		side = s;
		name = n;
	  double area = side*side;
      System.out.println("Area of square " +area);
	}
}

class Cylinder extends Circle implements NameofShape
{
	double height;
	
	Cylinder(double h,double r, String name(String name))
	{
		height = h;
		radius = r;
	
		double area = 2*3.14*radius*radius + height*radius;
      System.out.println("Area of Cylinder " +area);
	}
}

class Sphere extends Circle implements NameofShape
{

	
	Sphere(double r, String name(String name))
	{
		radius = r;
		
		Area(radius);
	}
	
	public void Area(double radius)
	{
		double area = 4*3.14*radius*radius;
		System.out.println("Area of sphere " +area);
	}
}

class Cube extends Square implements NameofShape
{
	
	Cube(double s, String name(String name))
	{
	
		side = s;
		
		Area(side);
	}
	
	public void Area(double side)
	{
		double area = 6* side*side;
      System.out.println("Area of Cube " +area);
	}
}

class Mensuration
{
	public static void main(String as[])
	{
		Shape circle = new Circle(12.34d,"circle");
		Shape square = new Square(10.95d,"Square");
		Cylinder cylinder = new Cylinder(12d,10d,"Cylinder");
	    Sphere sphere = new Sphere(15.5d,"Sphere");
	    Cube cube = new Cube(15.5d,"Cube");
	}
	
}

