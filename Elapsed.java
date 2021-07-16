class Elapsed
 {
	 public static void main(String args[])
	 {
		 long start, end;
		 
        System.out.println("Timing a for loop from 0 to 1,000,000");
          start = System.currentTimeMillis(); // get starting time
		   System.out.println("start time: " +start);
		//  for(int i=0; i < 1000000; i++)
			//  end = System.currentTimeMillis(); // get ending time
		 // System.out.println("end time: " +end);
         System.out.println("Elapsed time: " +(end-start));
      }
}