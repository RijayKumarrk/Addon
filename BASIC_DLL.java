package project;

public class BASIC_DLL {
	 Node head;
	    Node tail;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int val) {
	            data = val;
	            next = null;
	            prev = null;
	        }
	    }

	    public BASIC_DLL() {
	        head = null;
	        tail = null;
	    }

	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
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

	    public void displayprev() {
	        Node temp = tail;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	    	BASIC_DLL list = new BASIC_DLL();

	        list.insertAtBegin(10);
	        list.insertAtBegin(20);
	        list.insertAtBegin(30);
	        list.insertAtBegin(40);
	        list.insertAtBegin(50);

	        System.out.println("Linked List after inserting at beginning:");
	        list.display();
	    }

}
