package com.home.dp;

import com.home.common.CommonUtils;

public class LongestCommonSubsequence {
	public static void LCS(char[] str1, char[] str2) {
		int m = str1.length;
		int n = str2.length;
		int[][] l = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					l[i][j] = 0;
				} else if (str1[i - 1] == str2[j - 1]) {
					l[i][j] = 1 + l[i - 1][j - 1];
				} else {
					l[i][j] = CommonUtils.max(l[i][j - 1], l[i - 1][j]);
				}
			}
		}
		
		int index = l[m][n];
		char[] subSeq = new char[index+1];
		subSeq[index] = '\0';
		while(m > 0 && n > 0) {
			if(str1[m-1] == str2[n-1]) {
				subSeq[index-1] = str1[m-1];
				m--;n--;index--;
			} else if(l[m-1][n] > l[m][n-1]) {
				m--;
			} else {
				n--;
			}
		}
		System.out.println("longest common subsequence is : ");
		for (int i = 0; subSeq[i] != '\0'; i++) {
			System.out.print(subSeq[i]);
		}
		System.out.println();
	}
	
}