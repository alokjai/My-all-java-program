import java.io.*;
class makedir
{
	public static void main(String as[])
	{
		
		File f1 = new File("D:/wert");
		if(f1.mkdir())
		{	
			System.out.println("file created!");
			System.out.println("file name: "+f1.getName());
		}   
		else
			System.out.println("file not created!");
		
		
		
	if(f1.renameTo())
		{
			System.out.println("file renamed!");
			System.out.println(" new file name: "+f1.getName());
		}
		else
			System.out.println("file not rename!");
		
		
		System.out.println("file name: "+f1.getName());
		if(f1.delete())
		{
			System.out.println("file deleted!");
		}
		else
			System.out.println("file not delete!");
		
		/*System.out.println(" example of mkdirs()!");
		
		if(f1.mkdirs())
			System.out.println("file created!");
		else
			System.out.println("file not created!");
		*/
	}
}