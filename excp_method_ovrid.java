import java.io.*;
class parent 
{
	void msg()
	{
		System.out.println("parent");
	}
}
class excp_method_ovrid extends parent
{
	void msg()throws ArithmeticException
	{
		System.out.println("Test Exception");
	}
	public static void main(String[] args)
	{
		parent p=new parent();
		p.msg();
	}
}