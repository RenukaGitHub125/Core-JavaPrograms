package com.core.java;

import java.util.Scanner;

public class Vovels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
	    
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u') {
				System.out.print(ch+ " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("no of vovels:" +count);
		
	}

}
