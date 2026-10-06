package com.rcb.numberproblems;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2025;
		int count=(""+num).length();
		if(count%2!=0)
			System.out.println("not Tech Number");
		int divisor=1;
		int r=0;
		while(r<count/2) {
			divisor=divisor*10;
			r++;
		}
		int fh=num/divisor;
		int sh=num%divisor;
		int sum=fh+sh;
		if((sum*sum)==num)
			System.out.println("Tech No");
		else
			System.out.println("Not a Tech No");	
	}

}
