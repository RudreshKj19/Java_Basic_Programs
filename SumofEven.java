class SumofEven
{
	public static void main(String[] args)
	{
	  int num=5698;
	  int sum=0;
	  int count=0;
	  while(num>0)
	  {
		int digit=num%10;
		if(digit%2==0)
		{
		  System.out.println(digit);
		  count++;
		  sum+=digit; //sum=sum+digit;
		}
		num/=10; //num=num/10;
	  }
		System.out.println("Sum of Even digit: "+sum);
		System.out.println("Count: "+count);
		
		
       }
}