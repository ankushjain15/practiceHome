package com.home.common;

public class LinkedList<T> {
	protected Node<T> head;
	
	protected Node<T> holder;
	
	public LinkedList() {
		this.head = null;
	}
	
	public LinkedList(Node<T> head) {
		this.head = head;
	}
	
	public void addNode(T data) {
		Node<T> temp = head;
		if (head == null) {
			head = new UniDirectionalNode<T>(data);
			return;
		}
		while(temp.getRight() != null) {
			temp = temp.getRight();
		}
		temp.setRight(new UniDirectionalNode<T>(data));
		
	}
	
	public void remove(T data) {
		Node<T> temp = head;
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
	
	public void reverse() {
		Node<T> prev = null;
		Node<T> next = head;
		while (next != null) {
			head = next;
			next = head.getRight();
			head.setRight(prev);
			prev = head;
		}
	}
	
	public void printLL() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println("");
	}
	
	public boolean isPalindrome() {
		this.holder = this.head;
		return isPalindromeHelper(this.head);
	}
	
	private boolean isPalindromeHelper(Node<T> node) {
		if(node == null) {
			return true;
		}
		boolean isp = isPalindromeHelper(node.getRight());
		if(!isp) {
			return false;
		}
		boolean isp1 = node.getData().equals(this.holder.getData());
		this.holder = this.holder.getRight();
		return isp1;
		
	}
	
	public void pairWiseSwap() {
		if(this.head == null || this.head.getRight() == null) {
			return;
		}
		Node<T> prev = this.head;
		Node<T> curr = this.head.getRight();
		this.head = curr;
		while(true) {
			Node<T> next = curr.getRight();
			curr.setRight(prev);
			if(next == null || next.getRight() == null) {
				prev.setRight(next);
				break;
			}
			prev.setRight(next.getRight());
			prev = next;
			curr = prev.getRight();
		}
	}
}

