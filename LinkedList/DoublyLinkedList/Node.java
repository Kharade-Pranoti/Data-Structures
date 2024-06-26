package com.doubly.linked.lists;

public class Node {
	private int data;
	private Node nextnode;
	private Node prevnode;
	
	// default ctor
	public Node() {
		super();
	}

	// parametrized ctor
	public Node(int data) {
		this.data = data;
		nextnode = prevnode = null;
	}

	// getters and setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextnode() {
		return nextnode;
	}

	public void setNextnode(Node nextnode) {
		this.nextnode = nextnode;
	}

	public Node getPrevnode() {
		return prevnode;
	}

	public void setPrevnode(Node prevnode) {
		this.prevnode = prevnode;
	}
	
}
