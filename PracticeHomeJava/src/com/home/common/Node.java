package com.home.common;

public interface Node<T> {
	public Node<T> getLeft();
	public Node<T> getRight();
	public void setRight(Node<T> node);
	public void setLeft(Node<T> node);
	public T getData();
}
