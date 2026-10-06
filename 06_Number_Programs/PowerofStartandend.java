package com.rcb.numberproblems;

public class PowerofStartandend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=20;
		int end=30;
		int pow=3;
		for(int i=start;i<=end;i++) {
			int res=1;
			for(int j=1;j<=pow;j++) {
				res=res*i;
			}
			System.out.println(i+" : "+res);
		}
	}
	
}
