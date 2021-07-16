import java.io.*;
class ByteArrayInputStreamDemo 
{
	public static void main(String args[]) throws IOException 
	{
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte b[] = tmp.getBytes(); 
		ByteArrayInputStream input1 = new ByteArrayInputStream(b);
		ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
		int data1,data2;
		while((data1 = input1.read()) != -1)
		{
			System.out.print((char)data1);
		
		}
		
		
		System.out.println();
		System.out.println("second form of ByteArrayInputStream");
		
		while((data2 = input2.read()) != -1)
		{
			System.out.print((char)data2);
		}
         
		 input1.close();
		 input2.close();
		 
        
	}
}