package com.core.java;

import java.util.Scanner;

public class Factorial {
	public static void factorialNo(int n) {
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of :"+fact);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Factorial number:");
		int fact=sc.nextInt();
		factorialNo(fact);
		

	}

}
