
//Find sum of even fibonacii series bellow 10

 class Problem2
 {
	 public static void main(String[] asd)
	 {   
	    int a,b,c;
		int sum = 0;
		  a = 0;
		  b = 1;
		  c = a+b;
		for(int i=1;i<10;i++)
		{
			 a = b;
			 b = c;
			 c = a+b;
			if(c%2==0)
			{
				sum = sum + c;
			}				
			System.out.print(" "+c);
			
		}
		System.out.print("\n");
		System.out.println("Sum of even fibbonaci series : "+sum);
	 }
	 
	 
 }