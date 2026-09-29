class CountPrimeNum
{	
	public static void CuntPrime(int n)
	{
	      int countPrime=0;
	      while(n>0)
	      {
		int digit=n%10;
		int count=0;
		for(int i=2;i<=digit/2;i++)
		{
		  if(digit%i==0)
		  {
			count++;
			break;
		  }
		}
		  if(count==0)
		   {
			countPrime++;
		   }
		n/=10;
	     }
		System.out.println("Total Num of PrimeNumbers :"+countPrime);
	}  
	public static void main(String[] args)
	{
		CuntPrime(7233);
	}
}