class CountDigit
{
	public static void main(String[] args)
	{
		int n=12345;
		int count=0;
		int sum=0;
		while(n!=0)
		{
		  int digit=n%10;
		  sum=digit+sum;
		  count++;
		  n/=10;
		  
		}
	    System.out.println("Count of the Digits : "+count);
	    System.out.println("Sum of the Digits : "+sum);
	}
}	