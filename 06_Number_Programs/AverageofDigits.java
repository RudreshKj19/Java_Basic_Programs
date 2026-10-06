package com.rcb.numberproblems;

public class AverageofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=177;
		int sum=0;
		int count=0;
		int average=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
			count++;
		}
		average=sum/count;
		System.out.println(average);
	}

}
