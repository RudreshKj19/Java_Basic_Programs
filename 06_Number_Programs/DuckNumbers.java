package com.rcb.numberproblems;

public class DuckNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%10==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of DuckNums from 1 to 100 : "+count);

	}

}
