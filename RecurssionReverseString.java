package com.core.java;

import java.util.Scanner;

public class RecurssionReverseString {
	public static void  reverseString(String s) {
		String rev="";
		int a=0,len=s.length();
		
		//for (int i = 0; i <s.length(); i++) {
			while(a<len) {
			char ch=s.charAt(a);
			rev=ch+rev;
			a++;
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name=sc.next();
		reverseString(name);

	}

}
