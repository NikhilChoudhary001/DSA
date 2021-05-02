package com.ibm.bss;

import java.io.IOException;

public class MaxPathFromRootTree {
//	     1
//	    2   3
//	   4   5   6
//	          8
	Node root;
	
	static int min = Integer.MIN_VALUE;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) throws IOException {
		MaxPathFromRootTree tree = new MaxPathFromRootTree();
		tree.root = new Node(1);
		tree.root.left = new Node(-5);
		tree.root.right = new Node(-30);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(17);
		tree.root.right.left = new Node(17);
		tree.root.right.right = new Node(8);

		int max = findMax(tree.root);
		
		System.out.println("Max path length is"+ max);

	}

	private static int max(int left, int right) {
		if (left > right) {
			return left;
		} else {
			return right;
		}

	}

	private static int findMax(Node root) {
		int leftSum=0, rightSum = 0;
		int sum = 0;
		if (root == null) {

			return 0;
		} else {
			sum = sum + root.data;

			leftSum = sum + findMax(root.left);
			rightSum = sum + findMax(root.right);

			return max(leftSum, rightSum);
		}

	}

}