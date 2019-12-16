import java.util.Scanner;
class marray
{
public static void main(String []args)
{
int s=0;
int [][] arr =new int[3][3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}

System.out.print("************************************");
for(int i=0;i<3;i++)
{
System.out.println("");
for(int j=0;j<3;j++)
{
s=s+arr[i][j];
System.out.print("  "+ arr[i][j]);
}
}
System.out.print("sum of the numbers="+s);
}
}