class opoverload
{
void operator(String str1,String str2)
{
String s=str1+str2;
System.out.println("concatinated string="+s);
}
void operator(int a,int b)
{
int c=a+b;
System.out.println("sum="+c);
}
}
class opload
{
public static void main(String[] args)
{
opoverload obj=new opoverload();
obj.operator(2,3);
obj.operator("arvind"," vishwakarma");
}
}