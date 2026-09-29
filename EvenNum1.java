//WJP to check starts from even or odd digit.

class EvenNum1
{
	public static void main(String[] args)
	{
		int n=3457;
		while(n>10)
		{
			n/=10; // n=n/10;
		}
			if(n%2==0)
			System.out.println("even");
			else
			System.out.println("odd");
	}
}
		
		

