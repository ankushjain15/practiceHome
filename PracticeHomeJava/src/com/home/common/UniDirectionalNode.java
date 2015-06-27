package com.home.common;

public class UniDirectionalNode implements Node {
	protected int data;
	protected Node right;
	
	public UniDirectionalNode() {
		this.right = null;
	}
	
	public UniDirectionalNode(int data) {
		this.data = data;
	}
	
	@Override
	public Node getLeft() throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
	}
	@Override
	public Node getRight() {
		return this.right;
	}

	@Override
	public void setRight(Node node) {
		this.right = node;
		
	}

	@Override
	public void setLeft(Node node) throws IllegalAccessException {
		throw new IllegalAccessException("left node not defined for unidirectional node");
		
	}

	@Override
	public int getData() {
		return this.data;
	}
	
	
}
