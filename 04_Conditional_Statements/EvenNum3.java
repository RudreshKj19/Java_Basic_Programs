class EvenNum
{
	public static void PrintEven(int n)
	{
		
		if(n<10)
		{
		  if(n%2==0)
		      System.out.println(n + " ");
		      PrintEven(++n);
		}
	}
	public static void main(String[] args)
	{
		PrintEven(1);
	}
}