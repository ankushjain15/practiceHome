package com.home.gfg;

public class GFGCaller {

	public static void main(String[] args) {
		//majority element
		int[] arrMajorityElem = {3,2,3,4,5,3,3,2,3,3,6,7,3,3,1,3};
		ArrMajorityElementUnsorted.findMajorityElement(arrMajorityElem);
		
		int[] arrMaxContSum = {-9,8,4,-5,-7,6,4,-1,-3};
		ArrMaxContiguousSum.getMaxContiguousSum(arrMaxContSum);
		
		int[] arrMaxSumNoElemAdj = {5,-5,-10,-40,50,35};
		ArrMaxSumNoTwoElemAdjacent.findMaxSumNoTwoElemAdjacent(arrMaxSumNoElemAdj);
		
		ArrMaxDiffLarElemAfterSmallElem.getMaxDiffLargeElemAfterSmallElem(arrMaxSumNoElemAdj);
		
		Integer[] arrSort012 = new Integer[]{1,0,2,1,1,0,2,1,2,0,1,1};
		ArrSort012.sortArrOf012(arrSort012);
		
		int[] arrEquilibriumInd = {2,4,4,6,8,1,1};
		ArrEquilibriumIndex.printEquilibriumIndex(arrEquilibriumInd);
		
		int[][] arrPrintMatSpirally = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ArrPrintMatrixSpirally.printMatrixSpirally(arrPrintMatSpirally, 3, 4);
		
		Integer[] arrMedianOnline = {3,4,5,29,1,2,8,9,6,7,5};
		ArrMedianOnlineAlgo.printMedianOnline(arrMedianOnline);
		
		ArrLongestIncreasingSubsequence.printLISLength(arrMedianOnline);
		ArrMaxSumIncreasingSubsequence.printMaxSumIncreasingSubsequence(arrMedianOnline);
	}
}
