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
	}
}
