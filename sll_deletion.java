package Project;

public class sll_deletion {
	 Node head;
	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }
	    public void Insertion() {
	        head = null;
	    }	    
	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head = newNode;
	        }
	    }	    
	    public void insertAtEnd(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }
	    public void insertAtPosition(int pos, int val) {
	        if (pos < 0) {
	            System.out.println("Position can't be negative");
	            return;
	        }
	        Node newNode = new Node(val);
	        if (pos == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < pos - 1; i++) {
	            if (temp == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        if (pos == 0) {
	            head = head.next;
	            return;
	        }
	        Node temp = head;
	        for (int i = 0; i < pos - 1; i++) {
	            if (temp == null || temp.next == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            temp = temp.next;
	        }    
	        if (temp.next != null) {
	            temp.next = temp.next.next;
	        }
	    }
	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	sll_deletion list = new sll_deletion();
	        list.insertAtBegin(10);
	        list.insertAtBegin(20);
	        list.insertAtBegin(30);
	        list.insertAtBegin(40);
	        list.insertAtBegin(50);
	        System.out.println("Linked List after inserting at beginning:");
	        list.display();
	        list.insertAtPosition(2, 200);
	        System.out.println("Linked List after inserting 200 at position 2:");
	        list.display();
	        list.insertAtEnd(300);
	        System.out.println("Linked List after inserting 300 at the end:");
	        list.display();
	        list.deleteAtPosition(3);
	        System.out.println("Linked List after deleting node at position 3:");
	        list.display();
	    }
	

}
