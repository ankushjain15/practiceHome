package com.home.gfg;

public class ArrPrintMatrixSpirally {

	public static void printMatrixSpirally(int[][] mat,int m, int n) {
		int k=0,l=0;
		System.out.println("spirally matrix printing :");
		while (k < m && l < n) {
			for (int i = k; i < n; i++) {
				System.out.print(mat[k][i] + " ");
			}
			k++;
			for (int i = k; i < m; i++) {
				System.out.print(mat[i][n-1] + " ");
			}
			n--;
			if (k < m) {
				for (int i = n-1; i >= l; i--) {
					System.out.print(mat[m-1][i] + " ");
				}
				m--;
			}
			if (l < n) {
				for (int i = m-1; i >= k; i--) {
					System.out.print(mat[i][l] + " ");
				}
				l++;
			}
		}
	}
}
