class StringCompare
{
	public static void main(String as[])
	{
		String s1 = "alok is a boy here is a compare method";
		String s2 = "ALOK is a bOY method";
		
		String s0 = s1.trim();
		System.out.println(s0);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		System.out.println(s1.regionMatches(true,11,s2,11,2));
		
		
		
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.endsWith(s2));
		
		System.out.println("\n substring method demo\n");
		
		String s3 = s1.substring(7);
		System.out.println(s3);
		System.out.println(s1);
		
		System.out.println("\nsecond form\n");
		
		String s4 = s1.substring(0,12);
		System.out.println(s4);
		System.out.println(s1);
		
		System.out.println("\n use replace method \n");
		
		String s5 = s1.replace('e', 'a');
		System.out.println(s5);
		
		/*System.out.println("\nsecond form of replace method\n");
		String s6 = s2.replace('is', 'are');
		System.out.println(s6);
		*/
	}
}