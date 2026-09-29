class SmallDigit
{
	public static void main(String[] args)
	{
	   int n=2749;
	   int min=n%10;
	   while(n!=0)
	   {
		int digit=n%10;
		System.out.println(digit);
		if(digit<min)
		   min=digit;
		n/=10;
	   }
	     System.out.println("Smallest Digit:"+min);
	}

	
}