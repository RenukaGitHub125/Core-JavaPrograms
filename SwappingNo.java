package com.core.java;

import java.util.Scanner;

public class SwappingNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		c=a;
		a=b;
		b=c;
		
		System.out.println("a="+a+" b="+b);
	}
	

}
