class Conversion
{
	public static void main(String as[])
	{
		int num = 543534;
		char a[] = {'a', 'b', '5', '?', 'A', ' '};
		char b[] = {'r','o','r'};
		
		System.out.println(num+" to binary: " +Integer.toBinaryString(num));
		System.out.println(num+" to Hexa: " +Integer.toHexString(num));
		System.out.println(num+" to Octal: " +	Integer.toOctalString(num));
		
		for(int i=0; i<a.length; i++)
		{
			if(Character.isDigit(a[i]))
				System.out.println(a[i] + " is a digit.");
			
			if(Character.isLetter(a[i]))
				System.out.println(a[i] + " is a letter.");
			
			if(Character.isWhitespace(a[i]))
				System.out.println(a[i] + " is whitespace.");
			
			if(Character.isUpperCase(a[i]))
				System.out.println(a[i] + " is uppercase.");
			
			if(Character.isLowerCase(a[i]))
				System.out.println(a[i] + " is lowercase.");
			
        }
		
		if(Character.isMirrored())
				System.out.println( " is Mirrored.");
			else
				System.out.println("not mirrored");



	}
}