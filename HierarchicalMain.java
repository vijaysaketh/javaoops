import java.util.*;
import java.lang.*;
import java.io.*;
  
 class one
 {
   public void print_car()
   {
  System.out.println("cars");
   }
}
 
class two extends one
{
   public void print_for()
   {
    System.out.println("for sale");
   }
}

class three extends one
 {
    public void print_for()
   {
     System.out.println("for drive");
    }
}
class HierarchicalMain
{
public static void main(String[] args)
{
three obj = new three();
obj.print_car();
obj.print_for();
two obj1 = new two();
obj1.print_car();
obj1.print_for();

}
}
  