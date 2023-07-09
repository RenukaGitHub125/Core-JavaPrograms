package com.core.java;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number:");
		int n=sc.nextInt();
		int temp=n,rem;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		System.out.println("Number is palindrome");
		else
		System.out.println("Number is not palindrome");
	}

}
