package com.home.gfg.string;

public class RemovebAndac {
	public static void removebAndacFromStrinInplace(char[] str) {
		int i = -1, j = 0;
		int len = str.length;
		while(j < len) {
			if(j < len-1 && str[j] == 'a' && str[j+1] == 'c') {
				j += 2;
			} else if(str[j] == 'b') {
				j++;
			} else if(i >= 0 && str[i] == 'a' && str[j] == 'c') {
				i--;
				j++;
			} else {
				str[++i] = str[j++];
			}
		}
		str[++i] = '\0';
		System.out.println("string after removal of b and ac :");
		for (int k = 0; str[k] != '\0'; k++) {
			System.out.print(str[k]);
		}
	}
}
