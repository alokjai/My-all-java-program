enum Apple 
{
	Jonathan(10), GoldenDel(9), RedDel(), Winesap(), Cortland(8);
     private int price; // price of each apple

int getPrice()
 {
	 return price;
	 }
 Apple(int p) // Constructor
 {
	 price = p; 
	 }  
	 
	 Apple() // overload constructor
	 {
		 price = -1;
		 }

}

class EnumDemo3 
{
	public static void main(String args[])
	{
		Apple ap;    
		System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");
        System.out.println("All apple prices:");
		for(Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
    }
}