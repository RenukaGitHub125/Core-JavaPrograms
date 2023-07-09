package com.core.java;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table:");
		int table=sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			int t=table*i;
			System.out.println(table+"*"+i+"="+t);
		}

	}

}
