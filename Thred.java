class Th implements Runnable
{
	public void run()
	{
	  for(int i=1;i<3;i++){
		System.out.println("hello "+i);
      System.out.println(Thread.currentThread().getName());
      System.out.println(Thread.currentThread().isDaemon());
		try
	  {
		Thread.sleep(1000);
	   }
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
		
	  }
	  System.out.println(Thread.currentThread().getName()+" dead");
	}
}


class Thred
{
	public static void main(String as[])
	{
	Runnable t = new Th();
	Thread th = new Thread(t,"trd1");
     th.setDaemon(true);
	
	Runnable t2 = new Th();
	Thread th2 = new Thread(t2,"trd2");
	
	Runnable t3 = new Th();
	Thread th3 = new Thread(t3,"trd3");
	
	
	
	th.start();
   try
	{
		th3.join();
	}
	catch(InterruptedException e)
	 {
		System.out.println(e);
	   }
	
		
	th3.start();

th2.start();
	
	
	
	//Th tt = new Th();
	//tt.setName("t2");
	//System.out.println(t.getId());
	//tt.start();
	}
}