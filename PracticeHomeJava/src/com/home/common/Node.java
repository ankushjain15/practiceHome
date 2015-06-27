package com.home.common;

public interface Node {
	public Node getLeft() throws IllegalAccessException;
	public Node getRight();
	public void setRight(Node node);
	public void setLeft(Node node) throws IllegalAccessException;
	public int getData();
}
