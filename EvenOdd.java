package com.core.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table:");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" Even no");
		}else
			System.out.println(n+" Odd no");
	}

}
