package com.core.java;

import java.util.Scanner;

public class FirstPrimeNo {
	
	

	public static void main(String[] args) {
		int n=11;
		
		int i,j,count;
		boolean flag;
		for ( i = 2; i <= n; i++) {
		//	count=0;
			flag=false;
			for ( j = 2; j < i; j++) {
				if(i%j==0) {
					//count++;
					flag=true;
					break;
				}
			}
			//if(count==0)
			if(flag==false)
				System.out.print(i+" ");
		}

	}

}
