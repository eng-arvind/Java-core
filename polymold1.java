class student
{
static int multi(int a,int b)
{
return a*b;
}
static double multi(double a,double b)
{
return a*b;
}
}
class polymold1
{
public static void main(String[] args)
{
System.out.println(student.multi(4,5));
System.out.println(student.multi(5.5,6.6));
}
}