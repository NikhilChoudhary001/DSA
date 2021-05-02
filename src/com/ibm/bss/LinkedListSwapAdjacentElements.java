package com.ibm.bss;

public class LinkedListSwapAdjacentElements {
	
	ListNode head;
	
	static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args) {
		LinkedListSwapAdjacentElements l = new LinkedListSwapAdjacentElements();
		
		l.head = new ListNode(1);
		l.head.next =  new ListNode(2);
		l.head.next.next =  new ListNode(3);
		l.head.next.next.next =  new ListNode(4);
		
		
//		int count = 0;
//		int temp = 0;
		//ListNode new = 
//		while(l != null) {
//			if(count == 0) {
//				temp = l.val;
//				l.val = l.next.val;
//				l.next.val = temp;
//				count += 1;
//			}else {
//				count = 0;
//			}	
//			
//		}
		
//		ListNode curr = l.head.next.next;
//		ListNode prev = l.head;
//	    l.head = l.head.next;
//	    l.head.next = prev;
		
		
		reverse(l.head);
		ListNode head = null;
		head = swap(l.head);
		
		printList("After : ", head);

	}
	
	static ListNode swap(ListNode l) {
		ListNode curr = l;
		ListNode prev = null;
		
		while(curr != null && curr.next != null) {
			ListNode temp = curr.next;
			curr.next = temp.next;
			temp.next = curr;
			
			
			 if (prev == null) {
	                l = temp;
	            }
	            else {
	                prev.next = temp;
	            }
	 
	            prev = curr;
	            curr = curr.next;
	            
		}
		
		return l;
		}
	
	 public static void printList(String msg, ListNode head)
	    {
	        System.out.print(msg);
	 
	        ListNode ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.val + " —> ");
	            ptr = ptr.next;
	        }
	 
	        System.out.println("null");
	    }
	 
	 static ListNode reverse(ListNode l) {
		 ListNode curr = l;
		 ListNode prev = null;
		 ListNode next = curr.next;
		 
		 curr.next = prev;
		 
	 }
		
		
		
	}


