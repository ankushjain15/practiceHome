package com.home.dp;

//minimum cuts required such that each partition is a palindrome.
public class StrPalindromePartitioning {
	
	public static void printMinCutsToPartitionNSquare(char[] str) {
		int len = str.length, j=0;
		int[] c = new int[len]; //min cuts required to partition substring str[0...i]
		boolean[][] p = new boolean[len][len];	//p[i][j] is true if str[i...j] is palindrome.
		
		for (int i = 0; i < len; i++) {
			p[i][i] = true;
		}
		// for substrings of length 2 to len
		for (int L = 2; L <= len; L++) {
			for (int i = 0; i < len-L+1; i++) {
				j = i+L-1;
				if(L == 2) {
					p[i][j] = (str[i] == str[j]);
				} else {
					p[i][j] = (str[i] == str[j]) && p[i+1][j-1];
				}
			}
		}
		for (int i = 0; i < len; i++) {
			if(p[0][i]) {
				c[i] = 0;
			} else {
				c[i] = 1000; //INT_MAX
				for (int k = 0; k < i; k++) {
					if(p[k+1][i] && c[i] > (c[k] + 1)) {
						c[i] = c[k] + 1;
					}
				}
			}
		}
		System.out.println("minimum cuts : " + c[len-1]);
		
	}

	public static void printMinCutsToPartitionNCube(char[] str) {
		int len = str.length, j=0;
		int[][] c = new int[len][len]; //min cuts required to partition substring str[i...j]
		boolean[][] p = new boolean[len][len];	//p[i][j] is true if str[i...j] is palindrome.
		
		//c[i][j] is 0 if p[i][j] is true.
		for (int i = 0; i < len; i++) {
			c[i][i] = 0;
			p[i][i] = true;
		}
		// for substrings of length 2 to len
		for (int L = 2; L <= len; L++) {
			for (int i = 0; i < len-L+1; i++) {
				j = i+L-1;
				if(L == 2) {
					p[i][j] = (str[i] == str[j]);
				} else {
					p[i][j] = (str[i] == str[j]) && p[i+1][j-1];
				}
				if(p[i][j]) {
					c[i][j] = 0;
				} else {
					c[i][j] = 1000; //some INT_MAX kind of value.
					for (int k = i; k < j; k++) {
						c[i][j] = min(c[i][j], c[i][k] + c[k+1][j] + 1);
					}
				}
			}
		}
		
		System.out.println("minimum cuts : " + c[0][len-1]);
 		
	}
	
	private static int min(int a, int b) {
		return a < b ? a : b;
	}
}
