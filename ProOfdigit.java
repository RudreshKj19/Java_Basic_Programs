//WJp to find the product of each digit in the given num

class ProOfdigit
{
	public static void main(String[] args)
	{
	  int num=2749;
	  int pro=1;
	  while(num>0)
	  {
		int digit = num%10;
		System.out.println(digit);
		pro*=digit; //pro = pro*digit;
		num = num/10;
		
	  }
		System.out.println(pro);
		
       }
}