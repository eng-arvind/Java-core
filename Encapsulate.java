public class Encapsulate
{
public static void main(String[] args)
{
private String geekname;
private int geekroll;
private int geekage;
public int getage()
{
return geekage;
}
public String getname()
{
return geekname;
}
public int getroll()
{
return geekroll;
}
public void setage(int newage)
{
geekage=newage;
}
public void setname(String newname)
{
geekname=newname;
}
public void setroll(int newroll)
{
geekroll=newroll;
}
}
