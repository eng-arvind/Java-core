class excp_array_index
{
	public static void main(String[] args)
	{

      int a[]=new int[5];
      try{
      	a[10]=50;
      }
      catch(Exception e)
      {
      	System.out.println(e);
      }
        System.out.println("Rest of code");
	}
}