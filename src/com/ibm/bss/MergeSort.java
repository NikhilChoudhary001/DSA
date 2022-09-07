package com.ibm.bss;

import com.ibm.bss.ListDemo.Node;

public class MergeSort {
	
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
		MergeSort l = new MergeSort();
		l.head = new Node(1);
		l.head.next = new Node(25);
		l.head.next.next = new Node(5);
		l.head.next.next.next = new Node(4);
		l.head.next.next.next.next = new Node(10);
		
		l.printList(l.head);
		Node sortedHead = l.mergeSort(l.head);
		l.printList(sortedHead);

	}
	
	private Node mergeSort(Node head2) {
		if(head2 == null || head2.next == null) {
			return head2;
		} else {
			Node mid = findMid(head2);
			Node midToNext = mid.next;
			// I always forget to split like this in merge sort
			mid.next = null;
			Node left = mergeSort(head2);
			Node right = mergeSort(midToNext);
			
			Node sorted = sortElements(left, right);
			return sorted;
		}
		
	}

	private Node sortElements(Node left, Node right) {
		Node result = null;
		if(left == null) {
			return right;
		}
		if(right == null) {
			return left;
		}
		
		if(left.data < right.data) {
			result = left;
			result.next = sortElements(left.next, right);
		}else {
			result = right;
			result.next = sortElements(left, right.next);
		}
		
		return result;
		
	}

	private Node findMid(Node head2) {
		Node ptr1 = head2,ptr2= head2;
		
		while(ptr1.next != null && ptr1.next.next != null) {
			ptr1 = ptr1.next.next;
			ptr2 = ptr2.next;
		}
		
		return ptr2;
		
	}

	private void printList(Node head) {
		
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node n = head;
			while (n != null) {
				System.out.print(" "+ n.data);
				n = n.next;
			}
		}
		System.out.println("");

	}

}
