class DisplayFac
{

	public static void Factors(int n)
	{
	   System.out.print("factors of the given Num is : " );
	   for(int i=1;i<=n;i++)
	   {
		if(n%i==0)
		System.out.println(i);

	   }
	}
	public static void main(String[] args)
	{
	
		Factors(24);

	}
}