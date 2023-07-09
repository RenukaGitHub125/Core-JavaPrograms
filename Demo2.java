package com.string;

public class Demo2 {

	public static void main(String[] args) {
		String str = "i live in pune";
		int count = 0;
		for(int i=0;i< str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch==' ')
				count++;
		}
		
		System.out.println("Space:"+count);


	}

}
