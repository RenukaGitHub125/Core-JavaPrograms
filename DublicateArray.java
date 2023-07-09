package com.arr.prac;

public class DublicateArray {

	public static void main(String[] args) {
		 int arr[]= {3,4,2,1,8,2,4,3};
		int count=0;
		 for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						System.out.print(+arr[i]+",");
						
					}
				}
		 }
		 System.out.println();
		 System.out.println("how many time repeated:"+count);
	}

}
