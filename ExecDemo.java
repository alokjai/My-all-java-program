/*class ExecDemo 
{
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
	//	Process p ;
		
		try {
      			for(int i = 0; i<9; i++)
				     r.exec("notepad");
			}
		catch (Exception e)
		{
			System.out.println("Error executing notepad."); 
			}
				
}
}
*/


// Wait until notepad is terminated
class ExecDemo2
 {
	 public static void main(String args[])
	 {
		 Runtime r = Runtime.getRuntime();
		 Process p = null;
         try 
		 {
			// r.traceInstructions(true); 
			 //r.traceMethodCalls(true); 
			 p = r.exec("notepad");
			// p.destroy();
		    int n = p.waitFor();
           // r.halt(n);
           			
		  } 
		  catch(Exception e)
		  {
			  System.out.println("Error executing notepad.");
		  } 
		System.out.println("Notepad returned " + p.exitValue());
     }
}