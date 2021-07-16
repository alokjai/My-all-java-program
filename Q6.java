import java.util.*;
class Q6
{
  public static void main(String[] asd)
  {
    Scanner input = new Scanner(System.in);
	System.out.println("Enter month name");
	 String month = input.next();
	
	 if(month.compareTo("january")<0)
	    System.out.println("31 days "+month);
	  else if(month.compareTo("february") < 0)
             System.out.println("28 days but in Lip year");
           else if(month.compareTo("march") < 0)
              System.out.println("31 days "+month);
             else if(month.compareTo("april")< 0)
                System.out.println("30 days "+month);
                else if(month.compareTo("may")<0)
                  System.out.println("31 days "+month);
                  else if(month.compareTo("june")<0)
                    System.out.println("30 days "+month);
                     else if(month.compareTo("july")< 0)
                       System.out.println("31 days "+month);
                        else if(month.compareTo("august")<0)
                         System.out.println("31 days "+month);
                          else if(month.compareTo("september")<0)
                           System.out.println("30 days "+month);
                            else if(month.compareTo("october")<0)
                             System.out.println("31 days "+month);
                               else if(month.compareTo("november")<0)
                                System.out.println("30 days"+month);
                                 else if(month.compareTo("december")<0)
                                   System.out.println("31 days"+month);
                                   else
                                     System.out.println("invalid entry");									   
	
   }	
}