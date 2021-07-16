import java.util.*;
class Pyramid
{
	public static void main(String[] asd)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value");
		int q = sc.nextInt();
		 int w = q;
		 for(int i=1;i<=q;i++)
		 {
			 System.out.print(w);
			
			 if(i==q)
			 {
				  System.out.print("\n");
				 q = q-1;
				 i=0;
			 }
		 }
		
		
		
	}
}