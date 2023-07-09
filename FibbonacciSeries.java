package com.core.java;

import java.util.Scanner;

//0,1,1,2,3,5,8,13.....

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		int count=sc.nextInt();
		
		for (int i = 0; i < count; i++) {
		n1=n2;
		n2=sum;
		System.out.print(sum+ " ");
		sum=n1+n2;
		}
		
	}

}
