class PowerofNum
{
	public static void PowerNum(int base,int power)
	{
		int result=1;
		for(int i=1;i<=power;i++)
		{
		   result=result*base;
		}
		  System.out.println("Power:"+result);
	}
	public static void main(String[] args)
	{
		PowerNum(2,4);
	}
}