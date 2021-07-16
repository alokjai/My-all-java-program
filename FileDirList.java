import java.io.*;
 class OnlyExt implements FilenameFilter
{
	String ext;
  public OnlyExt(String ext)
	{
		this.ext = "." +ext;
	}
	
	public boolean accept(File dir , String name)
	{
		return name.endsWith(ext);
	}
}

public class FileDirList
{
	public static void main(String as[])
	{
		String dirname = "E:/";
		File f = new File(dirname);
		FilenameFilter only = new OnlyExt("doc");
		String s[] = f.list(only);
		
		for(int i = 0;i < s.length;i++)
		{
			System.out.println(s[i]);
		}
		
	}
}