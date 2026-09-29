class NaturalNum
{
	public static void PrintNatural(int n)
	{
		if(n<=10){
		System.out.println(n + " ");
		PrintNatural(++n);
		}
	}
	public static void main(String[] args)
	{
		PrintNatural(1);
	}
}