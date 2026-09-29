class CountofEvenDigit
{

	public static void EvenDigit(int n)
	{
		int count=0;
		while(n>0)
		{
		int digit=n%10;
		if(digit%2==0)
		{
			count++;
		}
		n/=10;
		}
	   System.out.println("Count of EvenDigit: "+count);
	
	}
	public static void main(String[] args)
	{

		EvenDigit(385);
		
	}
}