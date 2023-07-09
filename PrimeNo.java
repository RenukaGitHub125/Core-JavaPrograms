package com.core.java;

import java.util.Scanner;

public class PrimeNo {
	public static void primeNo(int n) {
		boolean flag=false;
		if(n==0 || n==1) {
			System.out.println("Not a prime number");
			
		}
		System.out.println("Divisible By:");
		for (int i = 2; i < n/2; i++) {
			if(n%i==0) {
			flag=true;	
			System.out.print(i+" ");
			}
			
		}
		if(flag) {
			System.out.println("not prime no");
		}else {
			System.out.println("prime no");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any Number:");
		int n=sc.nextInt();
		boolean flag=false;
//		for (int i = 0; i <5; i++) {
//			
//		}
		
		primeNo(n);
		
		
	}
}
