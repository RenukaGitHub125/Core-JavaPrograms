package com.arr.prac;

public class SecMaxNo {
	public static int secMax(int a[],int len) {
		int temp;
		for (int i = 0; i < len-1; i++) {
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		return a[len-2];
	}

	public static void main(String[] args) {
		int arr[]= {1006,5,3,5,9,2,9,1,7,8,12,99};
		int pos=arr.length;
		int secmax=secMax(arr,pos);
		System.out.println(secmax);

	}

}
