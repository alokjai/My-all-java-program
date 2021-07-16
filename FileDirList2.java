import java.io.*;
 class OnlyExt2 implements FileFilter
{
	String ext;
 public OnlyExt2(String ext)
	{
		this.ext = "." +ext;
	}
	
	public boolean accept(File dir)
	{
		return ;
	}
}

public class FileDirList2
{
	public static void main(String as[])
	{
		String dirname = "E:/";
		File f = new File(dirname);
		FileFilter only = new OnlyExt2("doc");
		File file[] = f.listFiles(only);
		
		for(int i = 0;i < file.length;i++)
		{
			System.out.println(file[i]);
		}
		
	}
}