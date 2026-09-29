class Digits
{
	public static void main(String[] args)
	{
	  int n=3546;
	  while(n>0)
	  {
		int rem=n%10;
		System.out.println(rem);
		n=n/10;
	  }
       }
}