package com.ibm.bss;

public class BinaryTreeDemo {
	Node root;
	static int min = Integer.MIN_VALUE;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		BinaryTreeDemo t = new BinaryTreeDemo();
		t.root = new Node(5);
		t.root.left = new Node(2);
		t.root.right = new Node(7);
		
		t.root.left.left = new Node(2);
		t.root.left.right = new Node(9);
		
		t.root.right.left = new Node(8);
		t.root.right.right = new Node(-1);
		
		findMin(t.root);
		
		System.out.println("Minimum element is"+min);
		
	}
	
	private static void findMin(Node n) {
		if(n == null) {
			//System.out.println("Empty Binary Tree");
		} else {
			System.out.println("Element is" +n.data);
			if(min < n.data) {
				min = n.data;
			}
			
			findMin(n.left);
			findMin(n.right);
		}
	}
	
	

}
