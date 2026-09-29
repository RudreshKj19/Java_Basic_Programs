class Calculator
{
	public static void main(String[] args)
	{
		Addition(100,298);
		Subtraction(400,300);
		Multiplication(34,78);
		Division(25,5);
	
	}
	
	public static void Addition(int a,int b)
	{
		System.out.println("Addition of a+b is:"+(a+b));
	}
	
	public static void Subtraction(int a,int b)
	{
		System.out.println("Subtraction of a-b is :" + (a-b));
	}

	public static void Multiplication(int a,int b)
	{
		System.out.println("Multiplication of a*b is:"+(a*b));
	}

	public static void Division(int a,int b)
	{
		System.out.println("Division of a/b is:"+(a/b));
	}

}
