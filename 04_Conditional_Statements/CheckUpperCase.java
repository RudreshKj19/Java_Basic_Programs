class CheckUpperCase
{
	public static void main(String[] args)
{
	char a = 'Z';
if(a>='A' && a<='Z')
{
	System.out.println(a+" is in Uppercase");
}
else if(a>='a' && a<='z')
{
	System.out.println(a+" is in Lowercase");
}
else if(a>='0' && a<='9')
{
	System.out.println(a+" is Digit");
}
else
{
	System.out.println(a+" is an SpecialChar");
}
}
}