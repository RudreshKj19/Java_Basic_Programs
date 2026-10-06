package com.rcb.numberproblems;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=256;
		int rev=0;
		int on=num;
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			rev=rev*10+digit;	
		}
		System.out.println(rev);
		if(on==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
