package com.arr.prac;

public class MaxNo {
	

	public static void main(String[] args) {
		int no[]= {3,4,2,1,8,6,1,45};
		int len=no.length;
		int max=no[0];
		for (int i = 0; i < len; i++) {
			if(max<no[i]) {
				max=no[i];
			}
		}
		System.out.println(max);

	}

}
