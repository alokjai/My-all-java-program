import java.io.*;
import java.util.*;
public class Readfilescan2
{
	public static void main(String[] asd)throws Exception
	{
		File file = new File("D:\\demo.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
	    System.out.println(sc.next());
	}
}