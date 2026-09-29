class MultiplicationTable
{

	public static void MulTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
		    System.out.println(n + "X" + i + "=" + (n*i));
		}
		
	}

	public static void main(String[] args)
	{
		MulTable(20);

	}
}