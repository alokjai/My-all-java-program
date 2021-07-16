

interface NameofShape
{
  String Name( String name);
  
} 


class Shape
{
  static String name = "";
}

class Circle extends Shape
{
	Double Radius;
	Circle()
	{
		//name = "circle";
		this(12.34d, name = "circle");
	}
	
    Circle(Double radius, String name)
	{
		 double area = 3.14 * radius*radius;
      System.out.println("Area of " +name+" " +area);	  
	}
}

class Square extends Shape
{
	Double side;
	Square()
	{
		//name = "Square";
		this(10.95d, name = "Square");
	}
	
    Square(Double side, String name)
	{
		double area = side*side;
      System.out.println("Area of " +name+" " +area);
	}
}

class Cylinder extends Circle implements NameofShape
{
	Double height;
	Cylinder()
	{
	   String name = Name("Cylinder");
		this(12d,10d,name);
	}
	
   Cylinder(Double h,Double r, String n)
	{
		double area = 2*3.14*r*r + h*r;
      System.out.println("Area of " +n+" " +area);
	}
}

class Sphere extends Circle implements NameofShape
{
	Sphere()
	{
		String name = Name("Sphere");
		this(15.5d,name);
	}
	
	Sphere(Double r, String n)
	{
		double area = 4*3.14*r*r;
		System.out.println("Area of " +n+" " +area);
	}
}

class Cube extends Square implements NameofShape
{
	Cube()
	{
		String name = Name("Cube");
		Cube(15.5d,name);
	}
	
	Cube(Double s, String n)
	{
		double area = 6* s*s;
      System.out.println("Area of " +n+" " +area);
	}
}

class MensurationLab
{
	public static void main(String as[])
	{
		Circle circle = new Circle();
		Square square = new Square();
		Cylinder cylinder = new Cylinder();
	    Sphere sphere = new Sphere();
	    Cube cube = new Cube();
	}
	
}