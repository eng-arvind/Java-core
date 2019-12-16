import java.lang.
class multi extends Thread
{
	public void run()
	{
		System.out.println("thread is reaning....");
	}
	public static void main(String[] args)
	{
		multi t=new multi();
		t.start();
	}
}