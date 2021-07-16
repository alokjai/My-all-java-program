class Array
{
  public static void main(String[] asd)
   {
      int a[]={34,56,78,83,32};
       
       for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
           {
             if (a[i]>a[j])
               {
                 int temp=a[i];
                 a[i]=a[j];
                  a[j]=temp;
               }
           }

       }
      System.out.println("result");
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    System.out.println("  ");
  }
}      