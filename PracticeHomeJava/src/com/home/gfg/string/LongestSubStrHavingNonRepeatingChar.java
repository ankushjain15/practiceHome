package com.home.gfg.string;

public class LongestSubStrHavingNonRepeatingChar {
	public static void printLenLongstSubStrHavingNonRepeatingChar(char[] str) {
		int[] visited = new int[256];
		int curLen = 0, maxLen = 0, prev = -1;
		for (int i = 0; i < visited.length; i++) {
			visited[i] = -1;
		}
		visited[0] = 0;
		for (int i = 1; i < str.length; i++) {
			prev = visited[str[i]];
			if(prev == -1 || (i - curLen) > prev) {
				curLen++;
			} else {
				if(curLen > maxLen) {
					maxLen = curLen;
				}
				curLen = i - prev;
			}
			visited[str[i]] = i;
		}
		
		if(curLen > maxLen) {
			maxLen = curLen;
		}
		
		System.out.println("\nlength of longest subarray having non repeating character : " + maxLen);
	}
}
