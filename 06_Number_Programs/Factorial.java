class Factorial
{

	public static int ReturnFactorial(int n)
	{
	     int fact=1;
	  for(int i=1;i<=n;i++)
	  {
		fact=fact*i;
	  }
	  return fact;
	}

	public static void main(String[] args)
	{
	  
		System.out.println(ReturnFactorial(5));
	  
	}
}