import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		Boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		   if(isPrime)
		   System.out.println("It's a Prime No");
		   else
		   System.out.println("Not a Prime No");
	}
}

