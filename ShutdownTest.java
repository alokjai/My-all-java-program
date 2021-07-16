class Child extends Thread
{
	public void run()
	{
		System.out.println("hiii");
	}
}

class ShutdownTest
{
	public static void main(String[] as)
	{
		Child child = new Child();
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(child);
		
		System.exit(0);
		System.out.println("in main......");
		child.start();
	}
}