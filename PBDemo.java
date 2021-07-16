import java.io.*;
import java.lang.*;
class PBDemo 
{
	public static void main(String args[]) {
     
    
	 List<String> list = new ArrayList<String>();
	 list.add("notepad");
	 try {
		 ProcessBuilder proc = new ProcessBuilder(list);
		 proc.start();
		  proc.command();
		 }
		 catch (Exception e) {
     			       System.out.println("Error executing notepad.");
				    }
				 
  }
}
