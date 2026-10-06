package com.rcb.numberproblems;

public class Swapfirstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23565;
		int on=23565;
		int count=0;
		int last=num%10;
		int first=0;
		while(num>0) {
			first=num%10;
			num=num/10;
			count++;
		  }
		int divisor=1;
		int r=1;
		while(r<count) {
			divisor=divisor*10;
			r++;
		}
		int mid=(on%divisor)/10;
		
		int res=(last*divisor)+(mid*10)+first;
		
		System.out.println(on);
		System.out.println(res);
		
	}
}
		
	


