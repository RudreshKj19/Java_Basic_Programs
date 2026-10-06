package com.rcb.numberproblems;

public class ProductofFirstDigitandLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=955;
		int last = n%10;
		int product = 1;
		while(n>9) {
			n=n/10;
		}
		int first = n;
		product=last*first;
		System.out.println("First Digit : "+n);
		System.out.println("Last Digit : "+last);
		System.out.println("Product of First and Last digit : "+ product);

	}

}
