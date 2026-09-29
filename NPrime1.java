class NPrime1
{
	public static void main(String[] args)
	{
		int n=20;
		int x=0;
		int num=0;
		int nth=3;
		
		for(int i=1;i<=24;i++)
		{	
			int count=0;
		   for(int j=1;j<=i;j++)
		     {
		    	if(i%j==0)
			{
		    	    count++;
			}
		     }
		    	if(count==2)
			{
			System.out.println(i);
			if(++x==nth)
			  num=i;
			}
		}
		     System.out.println(nth + "th Prime No is : " + num);
		
	}
}