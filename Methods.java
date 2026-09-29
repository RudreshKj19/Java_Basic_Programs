class Methods
{
	public static void M1()
	{
	  M2();
	  System.out.println("Method1");
	}

	public static void M2()
	{
	  
	  System.out.println("Method2");
	}

	public static void main(String[] args)
	{
		System.out.println("Start");
		    M1();
		System.out.println("Stop");
	}
}