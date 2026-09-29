class NPrime
{
	public static void main(String[] args)
	{
		int n=20;
		int nth=5;
		int x=0;
		int num=0;
		for(int i=2;i<=n;i++)
		{
			int count=0;
		   for(int j=2;j<=i/2;j++)
		    {
		      if(i%j==0)
		      {
			count++;
			break;
		      }
		    }
			if(count==0)
			{
			   System.out.println(i+" ");
			if(++x==nth)
			   num=i;
			}
		    }
			System.out.println("nth prime no is :"+num);
		}
	}		