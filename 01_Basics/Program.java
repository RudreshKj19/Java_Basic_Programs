class Program
{
	public static void test(int a)
	{
	  System.out.println("test Method");
	  if(a<5)
	  test(++a);
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		    test(1);
		System.out.println("Stop");
	}
}
