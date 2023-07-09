package com.core.java;

public class RecurssionFact {
	public static void factorial(int n){
		int a=1,fact=1;
		while (a<=n) {
			fact=fact*a;
			a++;
			
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int n=5;
		
		factorial(n);
		


	}

}
