package com.core.java;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number:");
	    String n=sc.next();
	    String rev="",temp=n;
	    for (int i = 0; i < n.length(); i++) {
			char ch=n.charAt(i);
			rev=ch+rev;
		}
	    System.out.println(rev);
	    if(temp.equals(rev)) {
	    	System.out.println("Palindrome String");
	    }else {
	    	System.out.println("not palindrome");
	    }

	}
	

}
