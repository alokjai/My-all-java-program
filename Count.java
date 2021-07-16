class Count
{
	public static void main(String[] asd)
	{
		int sum=0;
		for(int i=1;i<=101;i++)
		{
			sum=sum+i;
			
			if(sum==10)
			{
				System.out.println("Done it "+sum);
				  break;
			}
		}
	}
} 