class CountofEven
{
	public static void main(String[] args)
	{
	  int num=5698;
	  int count=0;
	  while(num>0)
	  {
		int digit=num%10;
		if(digit%2==0)
		{
		  System.out.println(digit);
		  count++;
		}
		num=num/10;
	  }
		System.out.println("Count of Even digit: "+count);
		
		
       }
}