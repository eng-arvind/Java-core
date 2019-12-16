class one
{
int x=10,y=20;
void disp()
{
System.out.println("method of class one");
System.out.println("value of x="+x);
System.out.println("value of y="+y);
}
}
class two extends one
{
void add()
{
System.out.println("method class two");
System.out.println("addition"+(x+y));
}
}
class three extends one 
{
void mul()
{
System.out.println("method of class three");
System.out.println("multiplication"+(x*y));
}
}
class hierachicaltest
{
public static void main(String[] args)
{
two obj1=new two();
three obj2=new three();
obj1.disp();
obj1.add();
obj2.mul();
}
}





