package com.rcb.numberproblems;

public class HappyNumorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		while(n!=1 && n!=4) {
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;	
		}
		n=sum;
	}
		if(n ==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Num");
	}
}
