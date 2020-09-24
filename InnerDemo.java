class Outer
{
  
    static int a;
   static public void show()
   {
   System.out.println("show method");
   }
  
   static class Inner
   {
     public void display()
     {
       System.out.println("display method");
     }
    }
 }
public class StaticInnerDemo
{
 public static void main(String[] arr)
 {
   Outer obj = new Outer();
    obj.show();
   Outer.Inner obj1= new Outer.Inner();
   obj1.display();
  }
}