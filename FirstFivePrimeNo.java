package com.core.java;

public class FirstFivePrimeNo {

	public static void main(String[] args) {
		boolean flag;
		int i;
		for ( i = 2; i <12 ; i++) {
			flag=false;
			for (int j =2; j <i; j++) {
				if(i%j==0) {
				flag=true;
				//break;

			}
		}
			if (flag==false) {
				System.out.println(i+" ");
			}
    }
		
//		System.out.println(i+" ");
 }
}
