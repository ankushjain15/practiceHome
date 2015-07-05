package com.home.gfg;

public class ArrMaxSumNoTwoElemAdjacent {

	public static void findMaxSumNoTwoElemAdjacent(int[] arr) {
		int maxInclPrev = 0, maxExclPrev = 0, inclCur = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((maxExclPrev + arr[i]) > maxInclPrev) {
				inclCur = maxExclPrev + arr[i];
				maxExclPrev = maxInclPrev;
				maxInclPrev = inclCur;
			} else {
				maxExclPrev = maxInclPrev;
			}
		}
		
		System.out.println("max sum : " + ((maxInclPrev > maxExclPrev) ? maxInclPrev : maxExclPrev));
	}
}
