  import java.io.*;
  import java.net.*;
  
  public class Server
  {
    public static void main(String[] args)
	{
		int pin[] = new int[4];
	  int pwd=0;
		try
		{
			ServerSocket ss = new ServerSocket(6666);
			 System.out.println("Server is started.....");
			Socket s = ss.accept();
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream in = new DataOutputStream(s.getOutputStream());
            for(int i=0;i<4;i++)
			{
			    pin[i] = (int)dis.read();
			    pwd = pin[i]*100 + pwd;
			}
            System.out.println("YOUR PASSWORD IS SEND");
			in.write(pwd);   //send password to client
			
			
			
			in.flush();
            in.close();
			ss.close();
		}
		
       catch(Exception e)
	   {
		   System.out.println(e);
	   }	   
	}
  }	