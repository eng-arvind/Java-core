class excp_finally
{
	public static void main(String[] args)
{

	try{
		int data=25/5;
		System.out.println(data);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	finally{
		System.out.println("finally block always executed");	
	}
	System.out.println("rest of code");

}
}
