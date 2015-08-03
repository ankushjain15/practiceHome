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
		return (pCrawl != null && pCrawl.isLeaf());
	}
	
	public void delete(String key) {
		char[] keyStr = key.toCharArray();
		int len = keyStr.length;
		deleteHelper(this.root, 0, len, keyStr);
	}
	
	private boolean deleteHelper(TrieNode node, int depth, int len, char[] keyStr) {
		if(node != null) {
			if(depth == len) {
				if(node.isLeaf()) {
					node.unMarkEnd();
					if(isFree(node)) {
						return true;
					}
				}
				return false;
			} else {
				if(deleteHelper(node.children[keyStr[depth]], depth+1, len, keyStr)) {
					node.children[keyStr[depth]] = null;
					return (!node.isLeaf() && isFree(node));
				}
			}
		}
		return false;
	}
	
	private boolean isFree(TrieNode node) {
		for (int i = 0; i < 256; i++) {
			if(node.children[i] != null) {
				return false;
			}
		}
		return true;
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
		if(node.isLeaf()) {
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
