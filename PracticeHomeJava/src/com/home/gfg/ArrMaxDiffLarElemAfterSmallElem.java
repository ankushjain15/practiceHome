package com.home.gfg;

public class ArrMaxDiffLarElemAfterSmallElem {
	
	public static void getMaxDiffLargeElemAfterSmallElem(int[] arr) {
		int max_diff = 0;
		int min_elem = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - min_elem > max_diff) {
				max_diff = arr[i] - min_elem;
			}
			if (arr[i] < min_elem) {
				min_elem = arr[i];
			}
		}
		System.out.println("max diff such that larger elem appears after smaller elem : " + max_diff);
	} 
}
