package com.home.gfg.string;

public class LexicographicRank {
	public static void printLexicographicRank(char[] str) {
		int[] count = new int[256]; //array to hold number of character less that equal to current ascii i.
		int len = str.length;
		int mul = fact(len);
		int rank = 1;
		populateCount(str, count);
		
		for (int i = 0; i < len; i++) {
			mul /= len - i;
			rank += count[str[i]-1]*mul;
			updateCount(count, str[i]); //because this str[i] can't be used further as smaller char to chars in the right.
		}
		System.out.println("rank of the string is : " + rank);
	}
	
	private static void updateCount(int[] count, char ch) {
		for (int i = ch; i < count.length; i++) {
			count[i]--;
		}
	} 
	
	private static void populateCount(char[] str, int[] count) {
		for (int i = 0; i < str.length; i++) {
			count[str[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
	}
	
	private static int fact(int num) {
		int res = 1;
		while(num > 0) {
			res = res*num--;
		}
		return res;
	}
}
