class Lcm2
{
	
	
	public static void main(String[] asd)
    {
		int num[] = {10,9,8,7,6,5,4,3,2};
		int i,j,mul=1;
		 
		 lable:
		 for(i=2;i<=num.length;i++)
		 {  
	        
  
		      for(j=0;j<=num.length;j++)
			        {
						 if(num[j]%i==0)
			                num[j] = num[j]/i;
                    } 
			        mul = mul*i;
			       for(int n=0;n<=9;n++)
			       {   
		              if(num[n]%i==0)
				       {
					     continue lable;
			            }
			        }	 
			 	 
		 }
		 System.out.println(mul);
	}	
}





