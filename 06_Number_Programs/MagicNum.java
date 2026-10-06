package com.rcb.numberproblems;

public class MagicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =37;
		
		while(num>9) {
			int sum=0;
			while(num!=0) {
				sum=sum+num%10;
				num/=10;
			}
			num=sum;
				
		}
		if(num==1)
			System.out.println("MagicNum");
		else
			System.out.println("Not a Magic Num");

	}

}
