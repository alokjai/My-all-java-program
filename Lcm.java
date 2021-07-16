class Lcm
{
	public static void main(String[] asd)
	{
		int i,j,mul=1;
		int num[] = {2,3,4,5,6,7,8,9,10};
		for(i=2;i<=10;i++)
		{
		  lable: for(j=2;j<=10;j++)
			     {    if(num[j-2]%i==0)
				     {  
		               num[j-2]=num[j-2]/i;
					   if (num[j-2]%i==0)
						    continue lable;
				      }	 
			     }
		 mul=mul*i;
		}
		System.out.println(mul);
	}
}
	