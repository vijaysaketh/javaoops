class Outer
{
  
    
    public void show()
   {
   System.out.println("show method");
   }
  
  }
public class AnonymousExample
{
 public static void main(String[] arr)
 {
   Outer obj = new Outer()
                      { 
                       public void show()
                         {
                            System.out.println("display method");
                           }
                       } ;


    obj.show();
  
  }
}