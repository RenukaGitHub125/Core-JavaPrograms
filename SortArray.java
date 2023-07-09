package com.arr.prac;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		 int arr[]= {3,4,2,1,8,2,4,3};
		 int temp;
//		 for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//			System.out.print(" "+arr[i]);
//		}
		 Arrays.sort(arr);
		 for (int i = arr.length-1; i > 0; i--) {
			System.out.println(arr[i]);
		}


	}
}
