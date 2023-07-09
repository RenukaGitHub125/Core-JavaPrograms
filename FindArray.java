package com.arr.prac;

import java.util.Scanner;

public class FindArray {

	public static void main(String[] args) {
		int arr[]= {5,3,5,9,2,9,1,7,8,12,99};
		int length=arr.length;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array index");
		int pos=sc.nextInt();
		if(pos<=length) {
			int ele = arr[pos];
			System.out.println(ele);
		}else {
	
	System.out.println("Array out of length..."+pos);
		}
	}

}
