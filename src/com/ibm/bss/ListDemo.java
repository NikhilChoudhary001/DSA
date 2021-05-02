package com.ibm.bss;

public class ListDemo {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		ListDemo l = new ListDemo();
		l.head = new Node(1);
		l.head.next = new Node(25);
		l.head.next.next = new Node(5);
		l.head.next.next.next = new Node(4);
		l.head.next.next.next.next = new Node(10);
		
		printList(l);

	}
	
	private static void printList(ListDemo list) {
		
		if (list.head == null) {
			System.out.println("List is empty");
		} else {
			Node n = list.head;
			while (n != null) {
				System.out.print(" -> "+ n.data);
				n = n.next;
			}
		}

	}

}
