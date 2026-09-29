class SumofMaxMin
{
	public static void main(String[] args)
	{
	   int n=2749;
	   int max=0;
	   int min=n%10;
	   int sum=0;
	   while(n>0)
	   {
		int digit=n%10;
		System.out.println(digit);
		if(digit>max)
		   max=digit;
		if(digit<min)
		   min=digit;
		sum=max+min;
		
		n/=10;
	   }
	     System.out.println("Largest Digit:"+max);
	     System.out.println("Smallest Digit:"+min);
	     System.out.println("Sum of Max and Min is : "+sum);
	}
}