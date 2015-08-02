package com.home.dp;

public class LongestPalindromicSubstr {
	public static void printLongestPalindromicSubstr(char[] str) {
		int len = str.length;
		int j = 0, start = -1;
		int maxLen = 0;
		boolean[][] p = new boolean[len][len];
		// for all substr of length 1.
		for (int i = 0; i < len; i++) {
			p[i][i] = true;
		}
		// for all substr of length 2.
		for (int i = 0; i < len - 1; i++) {
			if(str[i] == str[i+1]) {
				p[i][i+1] = true;
			}
		}
		// for all substr of length more that 2.
		for (int L = 3; L <= len; L++) {
			for (int i = 0; i < len-L+1; i++) {
				j = i+L-1;
				if((str[i] == str[j]) && p[i+1][j-1]) {
					p[i][j] = true;
					if(L > maxLen) {
						maxLen = L;
						start = i;
					}
				}
			}
		}
		System.out.println("longest palindromic substring is :");
		for (int i = start; i < start + maxLen; i++) {
			System.out.print(str[i]);
		}
	}
}
