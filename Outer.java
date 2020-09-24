class Outer
{
  
   int a;
   public void show()
   {
   System.out.println("show method");
   }
  
   class Inner
   {
     public void display()
     {
       System.out.println("display method");
     }
    }
 public static void main(String[] arr)
 {
   Outer obj = new Outer;
    obj.show();
   Outer.Inner obj1= new obj.Inner();
   obj1.display();
  }