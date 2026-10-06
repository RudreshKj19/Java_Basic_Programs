import java.util.Scanner;
class EvenorOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		if(num%2==0)
		{
		    System.out.println("Even Num");
		}
		else
		{
		    System.out.println("Odd Num");
		}
		
	}
}
		