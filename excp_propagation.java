class excp_propagation
{
	void m()
	{
		int data =50/0;
	}
	void n()
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
    	excp_propagation t=new excp_propagation();
    	t.p();
    	System.out.println("Normal flow");
    }
}