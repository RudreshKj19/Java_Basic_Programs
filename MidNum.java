class MidNum
{
public static void main (String[] args)
{
 int a=10;
 int b=20;
 int c=15;
if((a>b && a<c) || (a<b && a>c)) 
{
System.out.println(a+"is MidNum");
}
else if((b>a && b<c) || (b<a && b>c))
{
System.out.println(b+"is MidNum");
}
else
{
	System.out.println(c+"is MidNum");
}
}
}

