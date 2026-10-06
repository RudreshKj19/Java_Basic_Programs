package com.rcb.numberproblems;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int count =(""+num).length();
		int on=num;
		int sum=0;
		while(num!=0) {
			sum=sum+(int)Math.pow(num%10,count);
			num=num/10;
		}
		if(on==sum) 
			System.out.println("ArmStrong No");
			else 
			System.out.println("Not a ArmStrong No");
		

	}

}

