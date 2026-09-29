//WJP to find a Largest digit in the give num.

class LarDigit
{
	public static void main(String[] args)
	{
	   int n=3455;
	   int max=0;
	   while(n>0)
	   {
		int digit=n%10;
		System.out.println(digit);
		if(digit>max)
		   max=digit;
		n/=10;
	   }
	     System.out.println("Largest Digit:"+max);
	}

	
}