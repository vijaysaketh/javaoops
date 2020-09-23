class TryException{
public static void main(String args[])
{
 try{
  try{
     int b=39/0;
     System.out.println("going to divide");
     }
    catch(ArthmeticException e)
     {
     System.out.println(e);
     }
   
   try{
    
       int a[] = new int[5];
        a[5] = 4;
       }
      catch(ArrayOutOfBoundException e)
       {
       System.out.println(e);
        }
      System.out.print("other statments");
     
    catch (Exception e)
     {
      System.out.println("handeled");
     }
System.out.println("normal flow");
}
}
        