public class SinglyLinkedList {
	
	// a head to point to the first node of a linked list
	private Node head;

	// def ctor
	public SLL() {
		super();
		head = null;
	}
	
	// getters and setters
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	// insert a node in singly linked list
	public boolean insert(int data) {
		// create a node
		Node newnode = new Node(data);
		Node temp = head;
		
		// if list is empty
		if(head == null) {
			head = newnode;
			return true;
		}
		
		if(head.getData() == data) {
			return false;
		}
		
		// if list is not empty then locate the last node of a list and add the
		// node to the end of the list
		while(temp.getNextnode() != null) {
			temp = temp.getNextnode();
			if(temp.getData() == data) {
				return false;
			}
		}
		
		temp.setNextnode(newnode);
		System.out.println("data inserted");
		return true;
	}	
	
	// to insert a node into a list at a particular position
	public boolean insert(int data, int position) {
		// create a node
		Node newnode = new Node(data);
		Node prev = head;
				
		// if list is empty
		if(head == null) {
			head.setNextnode(newnode);
		}
		
		// to insert a node at first position of a list
		if(position == 1) {
			newnode.setNextnode(head);
			head = newnode;
			return true;
		}
		
			for(int i=1; i < position - 1; i++) {
				prev = prev.getNextnode();
				
				// if we reach the last node means the position given
				// is not a valid position
				if(prev == null) {
					return false;
				}
			}
			
			newnode.setNextnode(prev.getNextnode());
			prev.setNextnode(newnode);
			return true;
	}

	
	// to display all nodes in the lists
	public void display() {
		if(head == null) {
			System.out.println("list is empty");
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+ " ");
			temp = temp.getNextnode();
		}
		
		System.out.println();
	}
	
	// to display all node in reverse order
	public void displayReverse(Node temp) {
		if(temp == null) {
			return;
		}
		
		displayReverse(temp.getNextnode());
		System.out.print(temp.getData()+ " ");
	}
	
	// to find the no of nodes present in the list
	public void count() {
		int length = 0;
		
		Node temp = head;
		
		while(temp != null) {
			length++;
			temp = temp.getNextnode();
		}
		
		System.out.println("Total nodes present are "+length);
			
	}
	
	// to delete a node by value from the list
	public boolean deleteByVal(int value) {
		Node prev = head;
		Node delete = head;
		
		// if list is empty
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		
		while(delete.getData() != value) {
			prev = delete;
			delete = delete.getNextnode();
			
			//if we reach the last node
			if(delete == null) {
				return false;
			}
		}
		
		prev.setNextnode(delete.getNextnode());
		System.out.println(delete.getData()+" deleted!!");
		return true;
	}
	
	// to find min value in the list
	public void min() {
		Node temp = head;
		int min = Integer.MAX_VALUE;
		
		System.out.println("inside min");
		
		while(temp != null) {
			if(min > temp.getData()) {
				min = temp.getData();
			}
			temp = temp.getNextnode();
		}
		
		System.out.println("Min value: "+ min);
	}
	
	// to find max value in the list
	public void max() {
		Node temp = head;
		int max = Integer.MIN_VALUE;
		
		System.out.println("inside max");
		
		while(temp != null) {
			if(max < temp.getData()) {
				max = temp.getData();
			}
			temp = temp.getNextnode();
		}
		
		System.out.println("Max value: "+ max);
	}
	
	// to delete by position
	public void deleteByPosition(int position) {
		Node prev = head;
		Node del = head;
		
		int pos = 1;
		
		while(del!=null) {
			if(pos == position) {
				prev.setNextnode(del.getNextnode());
				System.out.println(del.getData()+" at position "+ pos + " deleted");
			}
			prev = del;
			del = del.getNextnode();
			pos++;
		}
	}
	
	
	// to search an element by value
	public void search(int value) {
		Node temp = head;
		int position = 1;
		
		while(temp != null) {
			if(temp.getData() == value) {
				System.out.println("Element found at position "+ position);
				return;
			}
			position++;
			temp = temp.getNextnode();
		}
		
		System.out.println("Element not found!!");
	}
}
