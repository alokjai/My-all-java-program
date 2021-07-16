import java.io.*;
class ByteArrayOutputStreamDemo2 
{
	public static void main(String args[]) throws IOException
	{
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "This is a boy typing";
		byte buf[] = s.getBytes();
		f.write(buf);
	
		for (int i=0; i<buf.length; i++)
			{ System.out.print((char) buf[i]); } 
		   System.out.println();
		    System.out.println("create a file to copy string");
			OutputStream file = new FileOutputStream("test.txt");
			f.writeTo(file);
			System.out.println("file created ");
			file.close();
			f.close();
			
		//	f.reset();
			System.out.println("abcd efgh ");
			System.out.println(f.toString());


			
    }
}		