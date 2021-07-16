class Student
{
	String name,address;
	int roll_no;
	long phone;
	
	void nameaddre(String n,String a)
	{
		name = n;
		address = a;
	}
   
    void rollpho(int r,long p)
    {
	   roll_no = r;
	   phone = p;
    }   
		
	
	public static void main(String[] asd)
	{
		Student ob = new Student();
		Student ob2 = new Student();
		
		ob.nameaddre("john","rampur");
		ob2.nameaddre("SAM","mariyahu");
		
		ob.rollpho(2,321344456);
		ob2.rollpho(3,46467487);
		
      		
	    System.out.println("Name of Student : "+ob.name );
		System.out.println("Roll_no : "+ob.roll_no);
		System.out.println("phone num : "+ob.phone);
		System.out.println("address : "+ob.address);
		System.out.println("\n");
	
		System.out.println("Name of Student : "+ob2.name);
		System.out.println("Roll_no : "+ob2.roll_no);
		System.out.println("phone num : "+ob2.phone);
		System.out.println("address : "+ob2.address);
		
	
		
		
	}
	
	
	
	

}