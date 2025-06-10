package project;

public class Dll_front {
	Node head;
	Node tail;
  
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
	}
	public Dll_front() {
		head=null;
		tail=null;
		
	}
	public void add(int val) {
		Node newNode=new Node(val);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	
		

	}
		public void Display() {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
			public void Displayprev() {
				Node temp=tail;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.prev;
				}
				System.out.println();
		
	}
		public static void main(String []args) {
			Dll_front rk=new Dll_front();
			rk.add(10);
			rk.add(20);
			rk.add(30);
			rk.add(40);
			rk.add(50);
			System.out.println("the added numbers are:");
			rk.Display();
			System.out.println("the added numbers in reverse:");
			rk.Displayprev();
		}
}
