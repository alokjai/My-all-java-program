import java.io.*;
import java.util.*;
public class Readfilescan
{
	public static void main(String[] asd)throws Exception
	{
		File file = new File("D:\\demo.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
			System.out.print(sc.hasNextLine());
	}
}