class StringBufferDemo
{
	public static void main(String as[])
	{
		StringBuffer sb = new StringBuffer(" hello how are you !..");
	    char target[] = new char[10] ;
		
		
		System.out.println("Buffer = "+sb);
		System.out.println("length = "+sb.length());
		System.out.println("capacity = "+sb.capacity());
		
		System.out.println("\n........ensurecapacity examaple.......\n");
		sb.ensureCapacity(10);
		System.out.println(sb);
		
		/*System.out.println("\n........setLength() examaple.......\n");
		
		sb.setLength(10);
		System.out.println("Buffer = "+sb);
		System.out.println("length = "+sb.length());
		*/
		System.out.println("\n........setCharAt() & charAt() examaple.......\n");
		
		//sb.setLength(10);
		System.out.println("Buffer = "+sb);
		System.out.println(" charAt() = "+sb.charAt(8));
		sb.setCharAt(5,'a');
		System.out.println(sb);
		
		System.out.println("\n........getchar() examaple.......\n");
		sb.getChars(3,8,target ,0);
		System.out.println(target);
	}
}