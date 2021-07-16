class proper
 {
   static String name , company;
    static int price;


    static void show()
    {
      
     System.out.println(name +" " +company+ " " +price);
    
    }
     
     void setdata(String n , String c , int p)
     {
       name = n;
       company = c;
       price = p;
     }
   
       
 }
  


class Pen
{

  public static void main(String[] arsg)
   {  
     proper p = new proper();
             p.setdata("jix" ,"elkos" ,23);
            // p.show();
      proper p1 = new proper();
        p1=p;
        p1.name = "bita";
       p.show();
           
    }


}


 