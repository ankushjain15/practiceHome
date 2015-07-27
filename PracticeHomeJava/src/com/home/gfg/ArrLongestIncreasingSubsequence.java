package com.home.gfg;

public class ArrLongestIncreasingSubsequence {
	public static void printLISLength(Integer[] arr) {
		int[] lis = new int[arr.length]; //holds the longest LIS length ending at i.
		lis[0] = 1;
		int maxLen = 1;
		for (int i = 1; i < lis.length; i++) {
			lis[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && (lis[j] + 1) > lis[i]) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		for (int i = 1; i < lis.length; i++) {
			if(maxLen < lis[i]) {
				maxLen = lis[i];
			}
		}
		System.out.println("\nLIS length is : " + maxLen);
		
	}
	
}
