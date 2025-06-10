package project;

public class dll_delete {
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

    public dll_delete() {
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

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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

    public void insertAtPosition(int pos, int val) {
        Node newNode = new Node(val);
        if (pos == 0) {
            insertAtBegin(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtEnd(val);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void deleteAtPosition(int pos) {
        if (head == null) 
        	return;

        if (pos == 0) {
            head = head.next;
            if (head != null)
            	head.prev = null;
            else tail = null;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null)
        	return;
        if (temp.prev != null) 
        	temp.prev.next = temp.next;
        if (temp.next != null)
        	temp.next.prev = temp.prev;
        if (temp == tail)
        	tail = temp.prev;
    }

    public static void main(String[] args) {
        dll_delete list = new dll_delete();

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);

        System.out.println("Linked List after inserting at beginning:");
        list.display();

        list.insertAtPosition(3, 600);
        System.out.println("Linked List after inserting 600 at position 3:");
        list.display();

        list.insertAtPosition(2, 200);
        System.out.println("Linked List after inserting 200 at position 2:");
        list.display();

        list.deleteAtPosition(3);
        System.out.println("Linked List after deleting node at position 3:");
        list.display();

        System.out.println("Reverse display:");
        list.displayprev();
    }
}
