class Stringdemo
{
	public static void main(String[] as)
	{
		/*String s = "hello";
		String s1 = new String("hello");
		String s2= new String("hello");
		String st = s1.intern();
		System.out.println(s1.equals(st));
		System.out.println(s1==st);
		s1 = "hiii";
		//String st = s1.intern();
		//System.out.println(st==s);
	
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		 
		 s.concat("hi");
		System.out.println(s);
		System.out.println(s.hashCode()); 
		
		char c[] = {'j','a','v','a'};
		String s1 = new  String(c);
		String s2 = new  String(s1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		byte b[] = {65,67,77};
		String s3 = new String(b);
		System.out.println(s3);*/
		
		StringBuffer sb = new StringBuffer(10);
		
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		
	}
}