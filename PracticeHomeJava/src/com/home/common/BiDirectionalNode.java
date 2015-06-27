package com.home.common;

public class BiDirectionalNode<T> extends UniDirectionalNode<T> implements Node<T> {
	protected Node left;
	
	public BiDirectionalNode() {
		super();
		this.left = null;
	}
	
	@Override
	public Node getLeft() throws IllegalAccessException {
		return this.left;
	}
}
