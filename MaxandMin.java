class MaxandMin
{

	public static void CheckMaxandMin(int n)
	{
		int max=0;
		int min=n%10;
		while(n>0)
		{
		    int digit=n%10;
		    if(digit>max)
		    max=digit;
	
		    if(digit<min)
		    min=digit;
		    n/=10;
		}
	   System.out.println("Max Digit:"+max);
	   System.out.println("Min Digit:"+min);
	}
	public static void main(String[] args)
	{
		CheckMaxandMin(748);
	}
}