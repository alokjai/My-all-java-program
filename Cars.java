import java.util.*;
class Cars
{
	String model,colors;
	int topSpeed,Y_of_M,price;
	
	void create(int topSpeed, String model, String colors, int Y_of_M)
	{
		this.topSpeed = topSpeed;
		this.model = model;
		this.colors = colors;
		this. Y_of_M = Y_of_M;
	}
	
	void Sold(int price)
	{
		this.price = price;	
	}
	
 static	void display(Cars obj)
	{
		System.out.println("\n\ntopSpeed : "+obj.topSpeed+" km/h");
		System.out.println("model : "+obj.model);
		System.out.println("colors : "+obj.colors);
		System.out.println("Year of manufacture : "+obj.Y_of_M);
		System.out.println("Price : "+obj.price);   
	}
	
	public static void main(String[] asd)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Create Santro car");
		Cars Santro = new Cars();
		System.out.println("give topSpeed");
		int tps = in.nextInt();
		System.out.println("give model");
		String mo= in.next();
		System.out.println("give colors");
		String co  = in.next();
		System.out.println("give year of manufacture");
		int ym = in.nextInt();
		System.out.println("Sell price");
		int pc = in.nextInt();
			   
	
		
		
		
		Cars Waganor = new Cars();
		System.out.println("\n\nCreate Waganor car");
		System.out.println("give topSpeed");
		int Sp = in.nextInt();
		System.out.println("give model");
		String as = in.next();
		System.out.println("give colors");
		String rang = in.next();
		System.out.println("give year of manufacture");
		int  make = in.nextInt();
		System.out.println("Sell price");
		int Rs = in.nextInt();
		
				
		Cars Alto = new Cars();
		System.out.println("\n\nCreate Alto car");
		System.out.println("give topSpeed");
		int speed = in.nextInt();
		System.out.println("give model");
		String look = in.next();
		System.out.println("give colors");
		String colar = in.next();
		System.out.println("give year of manufacture");
		int  mf = in.nextInt();
		System.out.println("Sell price");
		int rs = in.nextInt();
		
		Santro.create(tps,mo,co,ym);
		Santro.Sold(pc);
		display(Santro);
		
		Waganor.create(Sp,as,rang,make);
		Waganor.Sold(Rs);
		display(Waganor);
		
		
		Alto.create(speed,look,colar,mf);
		Alto.Sold(rs);
		display(Alto);
	}
}