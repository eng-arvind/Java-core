class invalidAgeExcp extends Exception
{
	invalidAgeExcp(String s)
	{
		super(s);
	}

}
class user_defin_excp 
{
	static void validate(int age)throws invalidAgeExcp
	{
		if(age<18)
			throw new invalidAgeExcp("Not valid");
		else
			System.out.println("welcome to code");
	}
	public static void main(String[] args)
	{
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured"+m);
		}
		System.out.println("rest of code");
	}
}