package com.home.gfg;


public class ArrLargestSubarrayHavingEqual0s1s {
	public static void printLargestSubarrayHavingEqual0s1s(int[] arr) {
		//element at i having sum of elements from index 0 to i, considering 1 for 1 and -1 for 0
		int[] sumLeft = new int[arr.length];
		sumLeft[0] = (arr[0] == 0) ? -1 : 1;
		int min = sumLeft[0], max = sumLeft[0], startIndex = 0, maxSize = -1;
		for (int i = 1; i < sumLeft.length; i++) {
			sumLeft[i] = sumLeft[i-1] + ((arr[i] == 0) ? -1 : 1);
			if(sumLeft[i] < min) {
				min = sumLeft[i];
			}
			if(sumLeft[i] > max) {
				max = sumLeft[i];
			}
		}
		System.out.println(max + " " + min);
		int[] hash = new int[max-min+1];
		for (int i = 0; i < hash.length; i++) {
			hash[i] = -1;
		}
		
		for (int i = 0; i < sumLeft.length; i++) {
			//for the case if subarray starts with index 0.
			if(sumLeft[i] == 0) {
				startIndex = 0;
				maxSize = i + 1;
				continue;
			}
			if(hash[sumLeft[i] - min] == -1) {
				hash[sumLeft[i] - min] = i;
			} else {
				if(i - hash[sumLeft[i] - min] > maxSize) {
					maxSize = i - hash[sumLeft[i] - min];
					startIndex = hash[sumLeft[i] - min] + 1;
				}
			}			
		}
		if(maxSize == -1) {
			System.out.println("no such subarray exists");
		} else {
			System.out.println("max size is " + maxSize + " starting from " + startIndex);
		}
		
	}
}
