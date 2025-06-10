package project;
import java.util.Scanner;
public class menu_driven {
	    Node head;
	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        newNode.next = head;
	        head = newNode;
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
	        if (temp == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        menu_driven list = new menu_driven();
	        Scanner rk = new Scanner(System.in);
	        int choice = 0;

	        while (choice != 7) {
	            System.out.println("\t\t  MENU");
	            System.out.println("1. Insert number at the start");
	            System.out.println("2. Insert number at the end");
	            System.out.println("3. Insert at any position");
	            System.out.println("4. Delete node at a position");
	            System.out.println("5. Display list");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = rk.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at start: ");
	                    int valStart = rk.nextInt();
	                    list.insertAtBegin(valStart);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at end: ");
	                    int valEnd = rk.nextInt();
	                    list.insertAtEnd(valEnd);
	                    break;
	                case 3:
	                    System.out.print("Enter position to insert: ");
	                    int pos = rk.nextInt();
	                    System.out.print("Enter value to insert: ");
	                    int valPos = rk.nextInt();
	                    list.insertAtPosition(pos, valPos);
	                    break;
	                case 4:
	                    System.out.print("Enter position to delete: ");
	                    int delPos = rk.nextInt();
	                    list.deleteAtPosition(delPos);
	                    break;
	                case 5:
	                    System.out.print("Linked list: ");
	                    list.display();
	                    break;
	                case 6:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        }
	    }
	


}
