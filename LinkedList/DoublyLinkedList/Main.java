

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedLists dll = new DoublyLinkedLists();
		boolean exit = false;
		
		try(Scanner sc = new Scanner(System.in)){
			
			while(!exit) {
			System.out.println("Choose any one option");
			System.out.println("1. Insert node /n2. Insert node by position"
					+ "/n3. Delete node by value /n4. Delete node by position"
					+ "/n5. Count of nodes /n6. Max node /n7. Min node /n8. Display node"
					+ "/n9. Exit");
			
			switch(sc.nextInt()) {
			case 1: // insert node
				System.out.println("Enter the data");
				dll.insert(sc.nextInt());
				break;
				
			case 2: // insert node at position
				System.out.println("Enter data and the position you want to insert");
				dll.insertByPosition(sc.nextInt(), sc.nextInt());
				break;
				
			case 3: // delete by value
				System.out.println("Enter data:");
				dll.deleteByValue(sc.nextInt());
				break;
				
			case 4: // delete  by position
				System.out.println("Enter position");
				dll.deleteByPosition(sc.nextInt());
				break;
				
			case 5: // count no of nodes
				dll.countNodes();
				break;
				
			case 6: // max node
				dll.maxnode();
				break;
				
			case 7: // min node
				dll.minnode();
				break;
				
			case 8: // display node
				System.out.println("List :");
				dll.display();
				break;
				
			case 9: // exit
				System.out.println("Exited!!");
				exit = true;
				break;
			}
			}
			
			
			
		}

	}

}
