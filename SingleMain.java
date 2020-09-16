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
 
 public class SingleMain
{
 public static void main(String[] args)
{
  two obj =new two();
   obj.print_cars();
   obj.print_for();
}
}