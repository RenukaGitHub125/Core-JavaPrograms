package com.arr.prac;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args) {
	   int no[]= {3,4,2,1,8};
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array ");
		int arr=sc.nextInt();
		int index=Arrays.binarySearch(no, arr);
		System.out.println(index);
	
}
}
