import java.io.*;
class ConsoleDemo
 {
	 public static void main(String args[])
	 {
		 //String str;
		 Console con;
		 char pass[] = new char[10];
       
       con = System.console();  // Obtain a reference to the console.
	   
	   if(con == null)
		   return;   // If no console available, exit.
        for(int i =0; i<9; i++)
		{
		   pass = con.readPassword();   // Read a string and then display it.
		   con.printf("Here is your string: %s\n", +pass[i]);
		}
		
		
     }
}
