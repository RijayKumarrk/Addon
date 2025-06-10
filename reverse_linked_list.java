package project;

public class reverse_linked_list {
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        class LinkedList {
            Node head;
            public Node reverseLinkedList(Node head) {
                Node prev = null;
                Node current = head;
                Node next = null;

                while (current != null) {
                    next = current.next;  
                    current.next = prev;  
                    prev = current;  
                    current = next;
                }
                return prev; 
            }
            public void printLinkedList(Node head) {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
            public Node createLinkedList(int[] arr) {
                if (arr.length == 0) return null;

                Node head = new Node(arr[0]);
                Node current = head;
                for (int i = 1; i < arr.length; i++) {
                    current.next = new Node(arr[i]);
                    current = current.next;
                }
                return head;
            }
        }
        
}
