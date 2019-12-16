class excp_no_format
{
	public static void main(String[] args)
   {
   	String s="abc";
   	try{
   		int i=Integer.parseInt(s);
   	}
   catch(Exception e)
   {
   	System.out.println(e);
   }
   System.out.println("rest of code");

   }
}