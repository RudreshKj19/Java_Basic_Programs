package com.rcb.numberproblems;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int sum=0;
		int on=n;
		while(n!=0)
		{
			int digit=n%10;
			int fact=1;
			for(int j=1;j<=digit;j++)
			{
				fact=fact*j;	
			}
			n=n/10;
			sum=sum+fact;
		}
		if(on == sum)
			System.out.println("StrongNum");
		else
			System.out.println("Not a StrongNum");
	
	}

}
