package com.rcb.numberproblems;

public class DisariumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=135;
		int on=num;
		int count = (""+num).length();
		int sum=0;
		while(num!=0) {
			sum=sum+(int)Math.pow(num%10, count--);
			num/=10;
		}
		if(sum == on) {
			System.out.println("Num is Disarium");
		}
		else {
			System.out.println("Num is not Disarium");
		}

	}

}
