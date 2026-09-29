class FactorialDigit
{

	public static void FacDigit(int n)
	{
	  while(n>0)
	  {
	     int digit=n%10;
	     int fact=1;
	   for(int i=1;i<=digit;i++)
	   {
		fact=fact*i;
	   }
	      n/=10;
	      System.out.println("Factorial of each Digit:"+fact);
	  }
		
	}
	public static void main(String[] args)
	{

	  FacDigit(465);

	}
}