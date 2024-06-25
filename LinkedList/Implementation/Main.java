
public class Main {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		sll.insert(50);
		sll.insert(60);
		sll.insert(70);
		
		sll.display();
		
		System.out.println("Reverse display");
		sll.displayReverse(sll.getHead());
		
		System.out.println();
		
		sll.count();
		
		System.out.println();
		
		sll.deleteByVal(50);
		
		sll.display();
		
		System.out.println();
		
		sll.min();
		
		System.out.println();
		
		sll.max();
		
		sll.deleteByPosition(3);
		sll.display();
		
		sll.search(70);
	}

}
