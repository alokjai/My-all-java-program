import java.util.*;
class Addistance
{
		
	public static void main(String[] asd)
	{
		float dist1,dist2,feet,Inch,add;
		int i;
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
			      Inch = dist1*12;
				  add = Inch+dist2;
				  System.out.println(" result "+add+" Inch");
				  break;
				  
			case 2:
                  feet = dist2/12;
                   add = feet+dist1;
				  System.out.println(" result "+add+" feet");	
                    break;
            default:
                  System.out.println("Invalid credential");	
                    break;				  
		}
	}
}