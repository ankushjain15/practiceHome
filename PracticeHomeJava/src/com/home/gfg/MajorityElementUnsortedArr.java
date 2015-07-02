package com.home.gfg;

public class MajorityElementUnsortedArr {
	
	public static void findMajorityElement(int[] arr) {
		int cand = findCandidate(arr);
		boolean isMajority = isMajority(arr, cand);
		if (isMajority) {
			System.out.println("Majority element : " + cand);
		} else {
			System.out.println("No majority element exist");
		}
	}
	
	private static boolean isMajority(int[] arr, int cand) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == cand) {
				count++;
			}
		}
		if (count > arr.length/2) {
			return true;
		}
		return false;
	}
	
	private static int findCandidate(int[] arr) {
		int maj_ind = 0, count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[maj_ind]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				maj_ind = i;
				count = 1;
			}
		}
		return arr[maj_ind];
	}

}
