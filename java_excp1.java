import java.lang.Object;
import java.io.*;
class java_exp1
{
	public static void main(String[] args)
	{
		String s=null;
		try{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}
}