class PrimeNum1
{
	public static void main(String[] args)
	{
		int n=24;
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
		    if(n%i==0)
		    {
		    count++;
		    break;
		    }
		    
		}
		  
		   if(count==0)
			System.out.println("Prime No");
			else
			System.out.println(" Not a Prime No");
		   
	        
	}
}