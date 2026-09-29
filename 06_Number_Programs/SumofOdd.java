class SumofOdd
{
	public static void main(String[] args)
	{
	  int num=5798;
	  int sum=0;
	  while(num>0)
	  {
		int digit=num%10;
		if(digit%2==1)
		{
		  System.out.println(digit);
		  sum=sum+digit;
		  
		}
		num=num/10;
	  }
		System.out.println("Sum of Odd digit: "+sum);
		
		
       }
}