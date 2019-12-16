class emp
{
public static void dd()
{
System.out.println("Hiiiii");
}
public emp()
{
System.out.println("My name is arvind");
}
public emp(int a)
{
System.out.println("Print a=" +a);
}
public emp(int a,int b)
{
System.out.println("sum of a and b=" + (a+b));
}
}
class cons1
{
public static void main(String[] args)
{
emp.dd();
emp obj=new emp();

emp obj1=new emp(3);
emp obj2=new emp(3,4);
}
}

