

import java.util.*;
class ArrPro2
{
	public static void main(String[] asd)
	{
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value in array");
         int value = input.nextInt();
		 System.out.println("Enter position of array");
		 int pos = input.nextInt();
		 		 
         for(int i =0; i<=9; i++)
		 {
			 if(i==pos)
			   { 
		         arr[i] = value;
		        }
			System.out.print(" "+arr[i]);
			
			 
		 }	
       		 
	}
}