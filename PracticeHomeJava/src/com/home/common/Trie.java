package com.home.common;

public class Trie {
	private TrieNode root;
	private int count;
	
	public Trie() {
		this.root = new TrieNode();
	}
	public Trie(TrieNode node) {
		this.root = node;
	}
	
	public void insert(String str) {
		char[] strArr = str.toCharArray();
		int i = 0;
		int len = strArr.length;
		this.count++;
		TrieNode pCrawl = root;
		for (i = 0; i < len; i++) {
			if(pCrawl.children[strArr[i]] == null) {
				pCrawl.children[strArr[i]] = new TrieNode();
			} 
			pCrawl = pCrawl.children[strArr[i]];
		}
		pCrawl.markEnd();
		
	}
	
	public boolean search(String key) {
		if(this.root == null) {
			return false;
		}
		char[] keyArr = key.toCharArray();
		int len = keyArr.length;
		TrieNode pCrawl = this.root;
		for (int i = 0; i < len; i++) {
			pCrawl = pCrawl.children[keyArr[i]];
			if(pCrawl == null) {
				return false;
			}
		}
		return (pCrawl != null && pCrawl.isEnd);
	}
	
	public void printTrie() {
		System.out.println("keys present in Trie are : ");
		char[] str = new char[50];
		printTrieHelper(this.root, str, 0);
	}
	private void printTrieHelper(TrieNode node,char[] str, int depth) {
		if(node == null) {
			return;
		}
		if(node.isEnd) {
			for (int i = 0; i < depth; i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
		for (char i = 0; i < 256; i++) {
			if(node.children[i] != null) {
				str[depth] = i;
				printTrieHelper(node.children[i], str, depth+1);
			}
		}
	}

}
