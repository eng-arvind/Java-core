abstract class base
{
void fun()
{
System.out.println("base fun called");
}
}
class Main extends base
{
public static void main(String [] args)
{
Main d=new Main();
d.fun();
}
}