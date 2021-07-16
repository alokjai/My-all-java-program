import java.io.*;
public class Readbuffer
{
	public static void main(String[] asd)throws Exception
	{
		File file = new File("D:\\demo.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while ((st = br.readLine())!= null)
			System.out.println(st);
	}
}