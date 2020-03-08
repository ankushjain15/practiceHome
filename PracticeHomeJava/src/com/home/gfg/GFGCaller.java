package com.home.gfg;

import com.home.common.Trie;
import com.home.dp.ArrLongestIncreasingSubsequence;
import com.home.dp.ArrMaxSumIncreasingSubsequence;
import com.home.dp.LongestCommonSubsequence;
import com.home.dp.LongestPalindromicSubstr;
import com.home.dp.StrPalindromePartitioning;
import com.home.gfg.string.AllPermutations;
import com.home.gfg.string.LexicographicRank;
import com.home.gfg.string.LongestSubStrHavingNonRepeatingChar;
import com.home.gfg.string.RemovebAndac;
import com.home.gfg.string.ReverseWords;

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
		ArrPrintMatrixDiagonally.printMatrixDiagonally(arrPrintMatSpirally, 3, 4);
		
		
		Integer[] arrMedianOnline = {3,4,5,29,1,2,8,9,6,7,5};
		ArrMedianOnlineAlgo.printMedianOnline(arrMedianOnline);
		
		ArrLongestIncreasingSubsequence.printLISLength(arrMedianOnline);
		ArrMaxSumIncreasingSubsequence.printMaxSumIncreasingSubsequence(arrMedianOnline);
		
		int[] arrLarSubarrayEqual0s1s = {0,1,1,1,0,0,1,1,0,1,0,1,1,1,0};
		ArrLargestSubarrayHavingEqual0s1s.printLargestSubarrayHavingEqual0s1s(arrLarSubarrayEqual0s1s);
		
		Character[] arrCharsAllPermutations = {'a','b','c'};
		AllPermutations.printAllPermutations(arrCharsAllPermutations);
		AllPermutations.printAllPermutationWithRepetition(arrCharsAllPermutations);
		
		String arrReverseWords = "hello, how are you?";
		ReverseWords.reverseWords(arrReverseWords.toCharArray());
		
		String strLenSubArrHavingNonRepeatingChar = "geeksforgeeks";
		LongestSubStrHavingNonRepeatingChar.printLenLongstSubStrHavingNonRepeatingChar
		(strLenSubArrHavingNonRepeatingChar.toCharArray());
		
		String strPalPartition = "ababbbabbababa";
		StrPalindromePartitioning.printMinCutsToPartitionNSquare(strPalPartition.toCharArray());
		
		String strRank = "string";
		LexicographicRank.printLexicographicRank(strRank.toCharArray());
		
		String strLongestPal = "forgeeksskeegfor";
		LongestPalindromicSubstr.printLongestPalindromicSubstr(strLongestPal.toCharArray());
		
		String strRemovebAndac = "abcnkuacjainc";
		RemovebAndac.removebAndacFromStrinInplace(strRemovebAndac.toCharArray());
		
		String lcsStr1 = "aggtab";
		String lcsStr2 = "gxtxayb";
		LongestCommonSubsequence.LCS(lcsStr1.toCharArray(), lcsStr2.toCharArray());
		
		Trie trie = new Trie();
		trie.insert("ankush");
		trie.insert("abhishek");
		trie.printTrie();
		trie.delete("ankush");
		trie.printTrie();
		System.out.println("\nsearch Trie for anush : " + trie.search("anush"));
		
		String myName = "ankushjain";
		System.out.println("\n ZigZag form is read as : " + StringWhenConvertedZigZagVertically.convertZigZagVertically(myName, 3));
		
	}
}
