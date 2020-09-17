class A
{
A()
{
System.out.println("parent class");
}
}
class instance extends A
{
instance()
{
super();
System.out.println("child class constructor");
}
{
System.out.println("instance intializer ");
}

public static void main(String[] args)
{
instance obj = new instance();
}
}