import java.io.*;
public class Readfile
{
	public static void main(String[] asd)throws Exception
	{
		FileReader fr = new FileReader("D:\\demo.txt");
		
		int i;
		while((i = fr.read())!= -1)
			System.out.print((char) i);
	}
}