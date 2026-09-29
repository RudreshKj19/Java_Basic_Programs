//WJP to check the given num is prime or not.

class CheckPrimeNum
{
	public static boolean PrimeNum(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
		  if(n%i==0)
		  return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		if(PrimeNum(7))
		System.out.println("PrimeNum");
		else
		System.out.println(" Not a PrimeNum");
			
	}
}
