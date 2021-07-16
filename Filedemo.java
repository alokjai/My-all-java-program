import java.io.*;
class Filedemo
{
	public static void main(String ss[])  throws FileNotFoundException, IOException
	{
		
		FileInputStream fis =  new FileInputStream("asd.txt");
		FileOutputStream fos =  new FileOutputStream("abc.txt");
		//RandomAccessFile rand = new RandomAccessFile(asd.txt,"rw");
		int data;
		while(( data = fis.read())!=-1)
		{
		System.out.println(data);	
   		 fos.write(data);
		}
		 fos.close();
		 fis.close();
		
		
		
	}
}