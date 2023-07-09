package com.arr.prac;

import java.util.Scanner;

public class FindPos {

	public static void main(String[] args) {
		int no[]= {3,4,2,1,8};
		int len=no.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array ");
		int arr=sc.nextInt();
		int index=len;
		if(index==arr) {
		index=arr;
		System.out.println(index);
		}
		else {
			System.out.println("No Array ");
		}
	}

}
