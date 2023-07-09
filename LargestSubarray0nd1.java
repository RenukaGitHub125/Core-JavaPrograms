package com.arr.prac;

public class LargestSubarray0nd1 {
	public static int findMaxLength(int a[]) {
		int maxlen=0;
		for (int start = 0; start < a.length; start++) {
			int zeroes=0,once=0;
			for (int end = 0; end < a.length; end++) {
				if(a[end]==0) {
					zeroes++;
				}else {
					once++;
				}
				if(zeroes==once) {
					maxlen=Math.max(maxlen, end-start+1);
				}
			}
		}
		return maxlen;
	}

	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,0,0};
		//int arr[]= {0,1,1,0,1,1};
		int n=findMaxLength(arr);
		System.out.println(n);
		
	}

}

 
  