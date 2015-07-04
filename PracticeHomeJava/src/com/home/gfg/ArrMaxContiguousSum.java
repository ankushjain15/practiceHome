package com.home.gfg;

public class ArrMaxContiguousSum {

	//doesn't work for all negative numbers.
	public static void getMaxContiguousSum(int[] arr) {
		int maxSoFar = 0, maxTillHere = 0;
		for (int i = 0; i < arr.length; i++) {
			maxTillHere = maxTillHere + arr[i];
			if (maxTillHere < 0) {
				maxTillHere = 0;
			}
			if (maxTillHere > maxSoFar) {
				maxSoFar = maxTillHere;
			}
		}
		System.out.println("max contiguous sum : " + maxSoFar);
	}
}
