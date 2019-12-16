class man extends boy
{
int a=5,b=6;
public void woman()
{
int c=a+b;
System.out.println("sum" +c);
}
}
class boy
{
int a=10,b=4;
public void girl()
{
int c=a-b;
System.out.println("sub" +c);
}
}
class testInhrt
{
public static void main(String[] args)
{
man obj=new man();
obj.girl();
}
}
























