class Return
{
	public static void main(String[] args)
	{
	    System.out.println("Return value: "+m1());
	    int res=m1();
	    System.out.println(res);
	}
	
	public static int m1()
	{
		System.out.println(200);
		return 100;
	}
}
