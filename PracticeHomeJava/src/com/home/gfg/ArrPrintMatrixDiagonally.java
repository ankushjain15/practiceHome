package com.home.gfg;

public class ArrPrintMatrixDiagonally {
	public static void printMatrixDiagonally(int[][] mat, int m, int n) {
		System.out.println("\nprinting matrix diagonally : ");
		int r = 0, c = 0;
		int rt,ct;
		for (r = m-1; r >= 0; r--) {
			ct = 0;
			rt = r;
			while(rt < m && ct < n) {
				System.out.print(mat[rt++][ct++] + " ");
			}
		}
		for (c = 1; c < n; c++) {
			rt = 0;
			ct = c;
			while(rt < m && ct < n) {
				System.out.print(mat[rt++][ct++] + " ");
			}
		}
	}
}
