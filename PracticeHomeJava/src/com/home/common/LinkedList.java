package com.home.common;

public class LinkedList {
	protected UniDirectionalNode head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void addNode(int data) {
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
	
	public void printLL() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getRight();
		}
	}
}

