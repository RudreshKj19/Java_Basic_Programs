class PrimeDigit
{
	public static void main(String[] args)
	{
	
		accessDigit(44575);

	}
	
	public static void accessDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
		    int rem=n%10;
		  boolean res=CheckPrime(rem);
		    if(res)
		    {
		      count++;
		    }
		    n=n/10;
		}
		System.out.println("Total Num of Prime Digits : "+count);
	}

	public static boolean CheckPrime(int rem)
	{
		for(int i=2;i<=rem/2;i++)
		{
			if(rem%i==0)
			return false;
		}
		 return true;
	}
}