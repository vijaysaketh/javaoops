class Base{
//overriding
void show()
{
 System.out.println("parents class");
}
}
class Child extends Base{
void show()
{
System.out.println("childs class");
}
}
class OverridingMain
{
public static void main(String[]args)
{

Base obj = new Child();
obj.show();
}
}