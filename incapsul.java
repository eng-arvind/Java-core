class incap
{
	private String name;
	private int roll;
	private int age;
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	public int getroll()
	{
		return roll;
	}
	public void setage(int newage)
	{
		age=newage;
	}
	public void setname(String newname)
	{
		name=newname;
	}
	public void setroll(int newroll)
	{
		roll=newroll;
	}

}
public class incapsul
{
	public static void main(String[] args)
	{
		incap t=new incap();
		t.setname("Arvind");
		t.setroll(123);
		t.setage(22);
		System.out.println(t.getname());
		System.out.println(t.getroll());
		System.out.println(t.getage());
	}
}