import java.io.*;
class BDreadLines
{
	public static void main(String gh[])
	
		throws IOException
		{
			String str;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter characters, 'stop' to quit.");
			
			do 
			{
				str = br.readLine();
                System.out.println(str); 
			}
	     	while(!str.equals("stop"));
        }
}			
			