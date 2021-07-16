class Binary
{
  public static void main(String args[])
   {
     int a = 8;
     int rev,sum = 0;
    
     while(a!=0)
      {
        rev = a%2;
        a = a/2;
        sum = sum*10 + rev;
        
       }
         System.out.println(sum);
    }
}