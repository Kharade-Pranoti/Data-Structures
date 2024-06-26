
public class DoublyLinkedLists {
	private Node head;

	public DoublyLinkedLists() {
		this.head = null;
	}

	// getter and setter for head
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	// to insert a node/data in a DLL
	public void insert(int data) {
		// create a node
		Node newnode = new Node(data);
		Node temp = head;
		
		// if list is empty
		if(head == null) {
			head = newnode;
			System.out.println("Node created and added into the list");
			return;
		}
		
		if(temp.getData() == data) {
			System.out.println("Duplicate element");
			return;
		}
		
		// if list is not empty
		while(temp.getNextnode() != null) {
			temp = temp.getNextnode();
		}
		
		temp.setNextnode(newnode);
		newnode.setPrevnode(temp);
		
		System.out.println("Node created and added into the list");
	}
	
	
	// insert node by position
	public void insertByPosition(int data, int position) {
		// create a node
		Node newnode = new Node(data);
		
		// if entered position is less than 0 -- it is invalid position
		if(position <= 0 || (head == null && position > 1)) {
			System.out.println("Invalid position");
			return;
		}
		
		// if position is 1
		if(position == 1) {
			if(head != null) {
				newnode.setNextnode(head);
				head.setPrevnode(newnode);
			}
			head = newnode;
			System.out.println("Node inserted");
			return;
		}
		
		// if position is other than 1
		Node temp = head;
		for(int i=1; i < position-1; i++) {
			temp = temp.getNextnode();
			if(temp == null) {
				return;
			}
		}
		// the below algorithm works properly if we want to insert node in 
		// any middle of the nodes but does not work properly if we try to 
		// insert node at last position because the last's next node points to null
//		newnode.setNextnode(temp.getNextnode());
//		newnode.setPrevnode(temp);
//		temp.setNextnode(newnode);
//		temp.getNextnode().setPrevnode(newnode);
		
		Node nextnode = temp.getNextnode();
		if(nextnode != null) {
			newnode.setNextnode(nextnode);
			nextnode.setPrevnode(newnode);
		}
		temp.setNextnode(newnode);
		System.out.println("Data inserted");
		
	}
	
	
	// to delete a node by value from a list
	public void deleteByValue(int data) {
		// if list is empty
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		
		// if list is not empty
		Node temp = head;
		Node del = head;
		
		while(del != null) {
			if(del.getData() == data) {
				temp.setNextnode(del.getNextnode());
				if(del.getNextnode() != null) {
					del.setPrevnode(temp);
				}
			}
			temp = del;
			del = del.getNextnode();
		}
		
		System.out.println("Deleted!!");
		return;
	}
	
	// delete by position
	public void deleteByPosition(int position) {
		// if list is empty
		if(head == null) {
			System.out.println("Nothing to delete. List is empty");
			return;
		}
		
		// if list is not empty
		int pos = 1;
		Node del = head;
		Node temp = head;
		
		while(del!=null) {
			if(pos == position) {
				temp.setNextnode(del.getNextnode());
				del.getNextnode().setPrevnode(temp);
				System.out.println("Deleted node from position "+pos);
				return;
			}
			pos++;
			temp = del;
			del = del.getNextnode();
		}
		
		return;
	}
	
	// count no of nodes in the list
	public void countNodes() {
		int length = 0;
		
		Node temp = head;
		while(temp!= null) {
			length++;
			temp = temp.getNextnode();
		}
		
		System.out.println("Total count of nodes = "+ length);
		return;
	}
	
	// to find max node in the list
	public void maxnode() {
		Node temp = head;
		int max = Integer.MIN_VALUE;
		
		while(temp!=null) {
			if(temp.getData() > max) {
				max = temp.getData();
			}
			temp = temp.getNextnode();
		}
		
		System.out.println("Max element = "+max);
	}
	
	//  to find min node in the list
	public void minnode() {
		Node temp = head;
		int min = Integer.MAX_VALUE;
		
		while(temp!=null) {
			if(temp.getData() < min) {
				min = temp.getData();
			}
			temp = temp.getNextnode();
		}
		
		System.out.println("Min element = "+min);
	}
	
	// to display doubly linked list
	public void display() {
		// check if list is empty
		if(head == null) {
			System.out.println("Doubly linked list is empty!");
			return;
		}
		
		// if list is not empty
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNextnode();
		}
		
		System.out.println();
	}

}
