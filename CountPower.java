class CountPower
{
	public static void main(String[] args)
	{
		int n=25;
		accessDigit(n);
	}
	
	public static int CountDigit(int n)
	{
		int count=0;
		do{
			count++;
			n=n/10;
		  }
			while(n!=0);
		return count;
	}
	
	public static void accessDigit(int n)
	{
		int count=CountDigit(n);
		while(n!=0)
		{
			int rem=n%10;
			PowerDigit(rem,count);
			n=n/10;
		}
	}
	public static void PowerDigit(int base, int pow)
	{
		int power=1;
		for(int i=1;i<=pow;i++)
		{
			power=power*base;
		}
		System.out.println(power);
	}
}