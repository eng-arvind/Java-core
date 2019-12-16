class box
{
double width,height,depth;
box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
box()
{
width=height=depth=0;
}
box(double len)
{
width=height=depth=len;
}
double volume()
{
return width*height*depth;
}
}
public class constload
{
public static void main(String[] args)
{
box mybox1=new box(10,20,15);
box mybox2=new box();
box mycube=new box(7);
double vol;
vol=mybox1.volume();
System.out.println("volume of box1 is="+vol);
vol=mybox2.volume();
System.out.println("volume of box2 is="+vol);
vol=mycube.volume();
System.out.println("volume of mycube is="+vol);
}
}