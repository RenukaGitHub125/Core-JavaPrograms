package com.core.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		if((year%400==0)||((year%4==0)&&(year%100!=0))) {
			System.out.println(year+ " is Leap Year ");
		}else
			System.out.println(year+" Not Leap Year");

	}

}
