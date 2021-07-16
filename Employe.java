class Employe
{
	public static void main(String[] asd)
	{
		String Name[] = {"Robert","Sam","John"};
		int YOfJ[] = {1994,2000,1999};
		String address[] = {"64c-WallStreet","68c-WallStreet","26B-WallStreet"};	
		
		System.out.println("NAME\tYEAR OF JOIN\tADDRESS");
		
		for(int i=0; i<3;i++)
		{
			System.out.println("\n"+Name[i]+"\t"+YOfJ[i]+"\t"+address[i]);
		}
	}
}