//WJP to display even factors of a given num.

class EvenFactors
{
	public static void main(String[] args)
	{
	 int n=30;
	 for(int i=1;i<=n;i++)
	 {
	 	if(n%i==0)
		{
			if(i%2==0)
			{  
				System.out.println(i);
			}
		}
	}
}

}
 