abstract class base
{
void fun()
{
System.out.println("base fun called");
}
}
class derived extends base
{
}
class main
{
public static void main(String [] args)
{
derived d=new derived();
d.base();
}
}