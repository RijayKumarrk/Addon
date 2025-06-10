package project;

import java.util.Scanner;

public class Dll_menuDriven {
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

	    public Dll_menuDriven() {
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
	    
	    public static void main(String []args) {
	    	Dll_menuDriven rk=new Dll_menuDriven();
	    	Scanner rijay=new Scanner(System.in);
	    	int choice=0;
	    	while(choice!=8)
	    	{
	    		System.out.println("\t\t MENU");
	    		System.out.println("1.INSERT AT BEGINING");
	    		System.out.println("2.INSERT AT THE END");
	    		System.out.println("3.INSERT AT ANY POSITION");
	    		System.out.println("4.DELETE AT ANY POSITION");
	    		System.out.println("5.DISPLAY");
	    		System.out.println("6.DISPLAY AT REVERSE");
	    		System.out.println("7.EXIT");
	    		System.out.println("enter u r choice:");
	    		 choice = rijay.nextInt();
	    		 switch(choice) {
	    		 case 1:
	    			 System.out.println("enter the value to insert: ");
	    			 int a = rijay.nextInt();
	                    rk.insertAtBegin(a);
	    			 break;
	    			 
	    		 case 2:
	    			 System.out.println("enter the number to insert at the end:");
	    			 int b = rijay.nextInt();
	                    rk.insertAtEnd(b);
	    			 break;
	    			 
	    		 case 3:
	    			 System.out.println("enter the value and the position to insert: ");
	    			 int pos = rijay.nextInt();
	    			 System.out.println("enter the value");
	    			 int val=rijay.nextInt();
	                    rk.insertAtPosition(pos,val);
	                    break;
	    		 case 4:
	    			 System.out.println("enter the position to delete: ");
	    			 int c = rijay.nextInt();
	                 rk.deleteAtPosition(c);
	                    break;
	                    
	    		 case 5:
	    			 System.out.println("diplaying the value:");
	    			 rk.display();
	    			 break;
	    			 
	    		 case 6:
	    			 System.out.println("Diplay the value in reverse:");
	    			 rk.displayprev();
	    			 break;
	    			 
	    		 case 7:
	    			 System.out.println("thank u!");
	    			 break;
	    			 
	    			 default:
	    				 System.out.println("enter the correct option given in the menu ");
	    		 }
	    		 
	    	}
	    }

		

}
