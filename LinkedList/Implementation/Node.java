public class Node {
	// In Singly Linked List, a node contains two parts - data and next node
	// (to store next node's address)
	private int data;
	private Node nextnode;
	
	// default ctor
	public Node() {
		super();
	}

	// param ctor
	public Node(int data) {
		super();
		this.data = data;
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

}
