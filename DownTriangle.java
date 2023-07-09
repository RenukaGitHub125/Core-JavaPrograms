package com.demo.pattern.star;
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
    

public class DownTriangle {
	public static void main(String[] args) {
		int row=5;
		for (int i = 0; i <=row; i++) {
			
				for (int k = 0 ; k <  i; k++) {
					System.out.print(" ");
				}
				for (int j = row-1; j >= i; j--) {
					System.out.print("* ");
					}
			System.out.println();
		 }
		}

}
