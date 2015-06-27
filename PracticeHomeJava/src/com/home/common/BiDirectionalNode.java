package com.home.common;

public class BiDirectionalNode extends UniDirectionalNode implements Node {
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
