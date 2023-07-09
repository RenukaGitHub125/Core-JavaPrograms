package com.core.java;

import java.util.Scanner;

public class SqrRoot {
	public static double squareRoot(int n) {//(9)
		double sqrt=n/2;//9/2=4.5
		double temp;  
		
		do {
		temp=sqrt;//4.5
		
		sqrt=(temp+(n/temp))/2;//(4.5+(9/4.5))/2=3.25
		}
		while((temp-sqrt)!=0);//4.5-3.25=1.25
		
		return sqrt;//3.25
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");//9
		int n=sc.nextInt();
		double sr=squareRoot(n);//(9)
		
		System.out.println("The square root of "+ n+ " is: "+sr); //

	}

	

}
