class SumofFL
{
	public static void main(String[] args)
	{
	  int n=3986;
	  int last=n%10;
	  int sum=0;
	  while(n>10)
	  {
		
		n/=10;
	  }
		sum=last+n;
		System.out.println(" Sum of First and Last digit : "+sum);
		
	}
}