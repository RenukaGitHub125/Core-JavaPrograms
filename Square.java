package com.demo.pattern.star;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		  int i,j;
		  int count;
		  
		  for(i=2;i<=11;i++) {
			  count=0;
			  for (j = 2; j <i ; j++) {
				  if(i%j==0)
		            {
		               count++;
		               break;
		            }
		         }
		         if(count==0)
		            System.out.print(i+",");
		      }
			
	}
	}



