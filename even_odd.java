class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd:"+i);
				try{Thread.sleep(1000);} catch(Exception e){}
			}
		}
	}

}
class Even extends Thread
{
	public void run()
	{
      for(int i=1;i<=50;i++)
      {
      	if(i%2==0)
      	{
      		System.out.println("Even:"+i);
      		try{Thread.sleep(1000);} catch(Exception e){}
      	}
      }
	}
}
public class even_odd
{
	public static void main(String[] args)
	{
		Odd t1=new Odd();
		Even t2=new Even();
		t2.start();
		t1.start();

	}
}