 class excp_multi
{
	public static void main(String[] args)
	{
		try{
			int a[]=new int[5];
			a[5]=30/0;
		   }
		catch(ArithmeticException e)
		  {
			System.out.println("ArithmeticException occurs");
		  }
		catch(ArrayIndexOutOfBoundsException e)
		   {
			System.out.println("ArrayIndexOutOfBoundsException occures");
		   }
		catch(Exception e)
		   {
			System.out.println(e);
		   }
		System.out.println("Rest of te code");
	}
}