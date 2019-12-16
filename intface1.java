interface I2
{
void show();
}
interface I3
{
void display();
}
class intface1 implements I2,I3
{
public void show()
{
System.out.println("1");
}
public void display()
{
System.out.println("2");
}
public static void main(String[] args)
{
intface1 t=new intface1();
t.show();
t.display();
}
}
