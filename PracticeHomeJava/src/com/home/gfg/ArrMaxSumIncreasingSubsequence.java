package com.home.gfg;

public class ArrMaxSumIncreasingSubsequence {

	public static void printMaxSumIncreasingSubsequence(Integer[] arr) {
		int[] liss = new int[arr.length]; //holds the longest LIS length ending at i.
		liss[0] = 1;
		int maxSum = 1;
		for (int i = 0; i < liss.length; i++) {
			liss[i] = arr[i];
		}
		
		for (int i = 1; i < liss.length; i++) {
			liss[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && (liss[j] + arr[i]) > liss[i]) {
					liss[i] = liss[j] + arr[i];
				}
			}
		}
		for (int i = 1; i < liss.length; i++) {
			if(maxSum < liss[i]) {
				maxSum = liss[i];
			}
		}
		System.out.println("sum of max sum increasing subsequence : " + maxSum);
	}
}
