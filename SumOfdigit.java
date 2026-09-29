//WJp to find the sum of each digit in the given num

class SumOfdigit
{
	public static void main(String[] args)
	{
	  int num=2749;
	  int sum=0;
	  while(num>0)
	  {
		int digit=num%10;
		System.out.println(digit);
		sum+=digit; //sum=sum+digit;
		num=num/10;
		
	  }
		System.out.println(sum);
		
       }
}