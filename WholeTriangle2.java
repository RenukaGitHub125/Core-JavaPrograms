package com.demo.pattern.star;

//            * * 
//          *   * 
//        *     * 
//      *       *   
//     *        *
//    * * * * * * 



public class WholeTriangle2 {

	public static void main(String[] args) {
		int row=5;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <=row; j++) {
				if(j==5 || i==5 || i+j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
