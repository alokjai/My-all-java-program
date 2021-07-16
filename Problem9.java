class Problem9
{
	public static void main(String[] ads)
	{  int i;
	   int a,d,c,x,y,z;
	   
		for(i=3;i<=1000;i++)
		{   
	        x=i;
			y=i+1;
			z=i+2;
		   a=x*x;
           d=y*y;
           c=z*z;
           if(a+d==c)
		   {System.out.println(a+" "+d+" "+c);
			   if((x+y+z)==1000)
			   {
				   System.out.println(x+" "+y+" "+z);
				   break;
			   }
		   }  			   
			
		}
	}
}