package com.ibm.bss;

public class Adobe {
	
	
	static int left;
	static int right;
	
	static boolean flag = true;
	static int maxTillNow = Integer.MIN_VALUE;
	
	static class Node{
		int data;
		Node left;
		
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;

	public static void main(String[] args) {
		Adobe tree = new Adobe();
		
		 tree.root = new Node(6); 
	        tree.root.left = new Node(4); 
	        tree.root.right = new Node(10); 
	        tree.root.left.left = new Node(2); 
	        tree.root.left.right = new Node(50); 
		
		
		boolean value = checkBST(tree.root);
		
		if(value) {
			System.out.println("Its a binary tree");
		}else {
			System.out.println("Not a binary tree");
		}

	}
	
	static boolean checkBST(Node root) {
		
		if(root == null) {
			return true;
		}
		
		flag = checkBST(root.left);
		
		if(!flag) {
			return false;
		}
		flag = checkBST(root.right);	
		
		if(!flag) {
			return false;
		}
		
		if(root.left != null && root.right != null && (root.left.data > root.data || root.right.data < root.data)) {
			//flag = false;
			return false;
		}else if(root.left != null && root.left.data > root.data) {
			//flag = false;
			return false;
		}else if(root.right != null && root.right.data < root.data) {
			//flag = false;
			return false;
		}

		if(root.right != null) {
			if(maxTillNow < root.right.data) {
				maxTillNow = root.right.data;
			}else {
				return false;
			}
	
		}
		
		return true;
	}
	
	
static void util(Node root) {
		
		
		
		
	}
}
