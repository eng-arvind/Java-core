import java.io.IOException;
class throws_excp
{
	void m()throws IOException
	{
		throw new IOException("device error");
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args)
	{
		throws_excp t=new throws_excp();
		t.p();
		System.out.println("Normal flow");
	}
}