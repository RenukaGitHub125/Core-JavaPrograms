package com.demo.pattern.star;

//* * * * * * 
//*         * 
//*         * 
//*         * 
//*         * 
//* * * * * * 

public class wholeSquare {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		for (int i = 0; i <=row; i++) {
			for (int j = 0; j <= col; j++) {
				if(j==0 || j==5 ||i==0 || i==5)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			
			System.out.println();
			
		}
	}

}
