import java.util.*;
import java.lang.*;
import java.io.*;
 
 class one{
 
  public  void print_cars(){
  
  System.out.println("cars");
 }
}

class two extends one{
  
 public void print_for(){
  System.out.println("for");
}
}
class three extends two{
public void print_sale()
{
System.out.println("sale");
}
}
 
 public class MultiMain
{
 public static void main(String[] args)
{
  three obj =new three();
   obj.print_cars();
   obj.print_for();
   obj.print_sale();
}
}