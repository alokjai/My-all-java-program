import java.util.*;
 class Addistance2
{
	 float feet,Inch,add;
	
   void convertInch(float feet, float Inch)
	{
	    this.Inch = feet*12;
		add = Inch+Inch;
		System.out.println(" result "+add+" Inch");
		
	}	
	
    void convertfeet(float feet, float Inch)
	{
		this.feet = Inch/12;
        add = feet+feet;
	   System.out.println(" result "+add+" feet");
	   
	}
		
		
		
	public static void main(String[] asd)
	{
		float dist1,dist2;
		int i;
		//Addistance2 you = new Addistance2();
		
			System.out.println("ADDING TWO DISTANCE INCH-FEET");
		
		Scanner in = new Scanner(System.in);
		System.out.print(" distance in Feet = ");
		dist1 = in.nextFloat();
		System.out.print("\n distance in Inch = ");
		dist2 = in.nextFloat();
		
		System.out.println("\n Choose 1 to find result in Inch or 2 find in feet ");
		i = in.nextInt();
		
		switch(i)
		{
			case 1:
			      new Addistance2().convertInch(dist1,dist2);
				  break;
				  
			case 2:
                  new Addistance2().convertfeet(dist1,dist2);	
                    break;
            default:
                  System.out.println("Invalid credential");	
                    break;				  
		}
	}
}


