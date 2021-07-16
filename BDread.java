import java.io.*;
class BDread
{
	public static void main(String gh[])
	
		throws IOException
		{
			char c;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter characters, 'q' to quit.");
			do
			{
				c = (char) br.read();
				System.out.print(c);
			}
			while(c != 'q');
        }

	
}
