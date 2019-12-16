class student
{
int roll;
void getroll(int x)
{
roll =x;
}
void putroll()
{
System.out.println("Roll number ="+roll);
}
}
class test extends student
{
int m1,m2;
void getmark(int x,int y)
{
m1=x;
m2=y;
}
void putmark()
{
System.out.println("test1="+m1);
System.out.println("test2="+m2);
}
}
class result extends test
{
int total;
void disp()
{
putroll();
putmark();
total=m1+m2;
System.out.println("total="+total);
}
}
class multilevel
{
public static void main(String[] args)
{
result obj=new result();
obj.getroll(101);
obj.getmark(80,85);
obj.disp();
}
}


