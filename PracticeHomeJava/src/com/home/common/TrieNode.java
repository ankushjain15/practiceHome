package com.home.common;

public class TrieNode {
	protected TrieNode[] children = new TrieNode[256];
	boolean isEnd;
	
	public TrieNode() {
		this.isEnd = false;
	}
	public boolean isLeaf() {
		return this.isEnd;
	}
	public void markEnd() {
		this.isEnd = true;
	}
	
}
