
class indexOfDemo
 {
	 public static void main(String args[])
	 {
		 String s = "Now is the time for all good men ";
      System.out.println(s);
	  
	  System.out.println("indexOf(h) = " + s.indexOf('t'));
	  
	  System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
	  
	  System.out.println("indexOf(men) = " + s.indexOf("men"));
	  
	  System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
	  
	  System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
	  
	  System.out.println("lastIndexOf(t, 20) = " + s.lastIndexOf('t', 20));
	  
	  System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
	  
	  System.out.println("lastIndexOf(the, 20) = " + s.lastIndexOf("the", 20));
      }
}