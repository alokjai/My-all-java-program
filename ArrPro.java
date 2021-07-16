
// WAP to remove a specific element from array.

import java.util.*;
class ArrPro
{
	public static void main(String[] asd)
	{
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int pos = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value to remove from array");
         int value = input.nextInt();
		 		 
         for(int i =0; i<=9; i++)
		 {
			 if(arr[i]==value)
			   { arr[i]= 0;
		           pos = i;
		         //System.out.println("position of remove value "+i);
		        }
			System.out.print(" "+arr[i]);
			
			 
		 }	
       System.out.println("\n position of remove value "+pos);		 
	}
}