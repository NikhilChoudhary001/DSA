package com.ibm.bss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AmazonTest {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		boolean visited;
		
		Node(int data){
			this.data = data;
			this.visited = false;
		}
	}

	public static void main(String[] args) {
//		AmazonTest a = new AmazonTest();
//		
//		List<Integer> row = new ArrayList<>();
//		List<Integer> row1 = new ArrayList<>();
//		List<Integer> row2 = new ArrayList<>();
//		List<Integer> row3 = new ArrayList<>();
//		List<Integer> row4 = new ArrayList<>();
//		
//		List<List<Integer>> column = new ArrayList<>();
//		
//		row.add(1);
//		row.add(1);
//		row.add(0);
//		row.add(0);
//		column.add(row);
//		
//		row1.add(0);
//		row1.add(0);
//		row1.add(1);
//		row1.add(0);
//		column.add(row1);
//		
//		row2.add(0);
//		row2.add(0);
//		row2.add(0);
//		row2.add(0);
//		column.add(row2);
//		
//		row3.add(1);
//		row3.add(0);
//		row3.add(1);
//		row3.add(1);
//		column.add(row3);
//		
//		row4.add(1);
//		row4.add(1);
//		row4.add(1);
//		row4.add(1);
//		column.add(row4);
		
		int count = 0;
		int visited[][] = new int[10][10];
		
		//int arr[][] = {{1,1,0,0},{0,0,1,0},{0,0,0,0},{1,0,1,1},{1,1,1,1}};
		int arr[][] = { { 1, 1, 0, 0, 0 }, 
                	    { 0, 1, 0, 0, 1 }, 
                	    { 1, 0, 0, 1, 1 }, 
                	    { 0, 0, 0, 0, 0 }, 
                	    { 1, 0, 1, 0, 1 } }; 
		int row = arr.length;
		
		for(int i = 0;i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int column = arr[i].length;
				if(arr[i][j] == 1 && visited[i][j] == 0) {
					count++;
					dfs(i,j,row,column,arr,visited);
				}
				System.out.print(arr[i][j]);
			}
			 System.out.println();
		}
		
		System.out.println("Count is"+ count);
		
//		for(List l : column) {
//			Iterator<Integer> list = l.iterator();
//	        while (list.hasNext()) {
//	        	int ele = list.next();
//	        	if(ele == 1) {
//	        		count = count + 1;
//	        	}else if(ele == 10) {
//	        		continue;
//	        	}else {
//	        		
//	        	}
//	            //System.out.print(list.next());
//	        }
//	        System.out.println();
//		}
		
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		
//		a.head = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
		
//		Node ele = a.head;
//		while(ele != null) {
//			System.out.print(ele.data + " ");
//			ele = ele.next;
//		}
//		Node reversed = reverse(a.head);
//		System.out.println("Reverseed =----\n");
//		while(reversed != null) {
//			
//			System.out.println(reversed.data);
//			reversed = reversed.next;
//		}
		
	}

	private static void dfs(int i, int j, int row, int column,int arr[][],int visited[][]) {
		
		if(i >= 0 && j >= 0 && i < row && j < column && arr[i][j] == 1 && visited[i][j] == 0) {
			visited[i][j] = 1;
			dfs(i-1,j,row,column,arr,visited);
			dfs(i,j-1,row,column,arr,visited);
			dfs(i+1,j,row,column,arr,visited);
			dfs(i,j+1,row,column,arr,visited);
		}
		
	}

	private static Node reverse(Node head2) {
		AmazonTest list = new AmazonTest();
		
		if(head2 != null) {
			//list.head = new Node(head2.data);
			
			Node curr = head2;
			Node prev = null;
			
			while(curr != null) {
				Node ele = new Node(curr.data);
				ele.next = prev;
				
				prev = ele;
				curr = curr.next;
			}
			return prev;
		} else {
			return null;
		}	
	}
}
