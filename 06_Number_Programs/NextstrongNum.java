package com.rcb.numberproblems;

public class NextstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;	
		while(true) 
		{
			n++;
			
			int on=n;
			int var=n;
			int sum=0;
		while(var!=0)
		{
			int digit=var%10;
			int fact=1;
			for(int j=1;j<=digit;j++)
			{
				fact=fact*j;	
			}
			sum=sum+fact;
			var=var/10;
		}
		if(on == sum) 
			{
			System.out.println("Next Strong Num : "+n);
			break;
		 }
		
	   }
	
	}

}

	

