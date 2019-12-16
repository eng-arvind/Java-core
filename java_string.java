import java.lang.Object;
import java.io.*;
class java_string
{
	public static void main(String[] args)
	{
		String s=null;
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}
}