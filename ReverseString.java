package com.core.java;

import java.util.Scanner;

public class ReverseString {
	public static void  reverseString(String s) {
		String rev="";
		
		for (int i = 0; i <s.length(); i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name=sc.next();
		String temp=name;

		reverseString(name);
		
		if(name.equals(temp)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
