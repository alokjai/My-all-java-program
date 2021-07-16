// An enumeration of apple varieties.Example of value() and valueof() method in enumeration
 enum Apple
 {
	 jonathan, goldenDel, redDel, winesap, cortland ;	
  }
 class EnumDemo2 
   {
	   public static void main(String args[])
	 {
		 Apple ap;
         System.out.println("Here are all Apple constants:");
        Apple allapples[] = Apple.values();   //use values() method
		for(Apple a : allapples)
			 System.out.println(a);
		 
             System.out.println();
         ap = Apple.valueOf("winesap");     // use valuesof() method
		 System.out.println("ap contains " + ap);
	 }
   }
