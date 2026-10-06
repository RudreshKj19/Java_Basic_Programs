package com.rcb.numberproblems;

public class FibonacciNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a+" "+b);
		while( c<=num) {
			c=a+b;
			if(c<=num) 
				System.out.println(c);
			a=b;
			b=c;	
		}

	}

}
