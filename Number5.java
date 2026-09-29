class Number5
{
public static void main(String[] args)
{
int a = 7;
if(a%3==0 && a%5==0)
{
System.out.println(a+" divisible by both 3 & 5");
}
else if(a%5==0)
{
System.out.println(a+" divisible by 5");
}
else if(a%3==0)
{
System.out.println(a+" divisible by both 3");
}
else
{
System.out.println(a+" Not divisible by 3 & 5");
}
}
}
