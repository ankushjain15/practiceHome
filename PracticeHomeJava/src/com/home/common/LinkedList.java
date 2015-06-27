package com.home.common;

public class LinkedList<T> {
	protected Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addNode(T data) {
		Node temp = head;
		if (head == null) {
			head = new UniDirectionalNode(data);
			return;
		}
		while(temp.getRight() != null) {
			temp = temp.getRight();
		}
		temp.setRight(new UniDirectionalNode(data));
		
	}
	
	public void remove(T data) {
		Node temp = head;
		if(data == temp.getData()) {
			head = head.getRight();
		}
		while (temp.getRight() != null) {
			if (temp.getRight().getData() == data) {
				temp.setRight(temp.getRight().getRight());
				return;
			}
			temp = temp.getRight();
		}
	}
	
	public void printLL() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getRight();
		}
	}
}

