package com.demo.pattern.star;

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 


public class RightTriangle {
	public static void main(String[] args) {
		int row=5;
		for (int i = 0; i <=row; i++) {
			for (int j = row; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
