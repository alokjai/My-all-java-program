
//find the difference between the sum of the squares of first 100 natural number and square of the sum.
class Problem6
{
	public static void main(String[] asd)
	{
		int sum=0,i,s;
		int sum2 = 0;
		for(i=1;i<=100;i++)
		{
		    s = i*i;
			sum= sum + s;
			
			sum2= sum2 + i;
			
		}
		sum2 = sum2 * sum2;
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum2+"-"+sum+" = "+(sum2-sum));
		
	}
	
}