package com.ibm.bss;

import com.ibm.bss.BinaryTreeDemo.Node;

public class HeapSort {
	
	static int maxHeap[] = new int[6];
	static int sorted[] = new int[6];
	static int ind = 0;
	
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		int arr[] = {7,17,5,25,1,6};
		
		int index = 1;
		for(int i : arr) {
			insert(i,index);
			++index;
		}
		
		for(int m : maxHeap) {
			System.out.println(m+ " ");
		}
		
		index = 6;
		for(int m : maxHeap) {
			//System.out.println(m+ " ");
			delete(m,index);
			--index;
		}
		
		System.out.println("--------------------------");
		for(int s : sorted) {
			System.out.println(s+ " ");
		}
	}
	
	public static void insert(int n, int index) {
		int temp=0;
		maxHeap[index-1] = n;
		while(index > 1 && maxHeap[index-1] > maxHeap[(int)Math.floor(index/2f)-1]) {
			temp = maxHeap[(int)Math.floor(index/2f)-1];
			maxHeap[(int)Math.floor(index/2f)-1] = maxHeap[index-1];
			maxHeap[index-1] = temp;
			index = (int)Math.floor(index/2f);
		}
	
	}
	
	public static void delete(int n, int index) {
		sorted[ind] = maxHeap[0];
		++ind;
		int temp = 0;
		
		maxHeap[0] = maxHeap[index-1];
		int curr = 1;
		
		while(curr*2 < 6 && (maxHeap[(curr*2)-1] > maxHeap[curr-1] || maxHeap[(curr*2)] > maxHeap[curr-1])) {
		if(maxHeap[(curr*2)-1] > maxHeap[curr*2]) {
			temp = maxHeap[(curr*2)-1];
			maxHeap[(curr*2)-1] = maxHeap[curr-1];
			 maxHeap[curr-1] = temp;
			 curr=curr*2;
		}else {
			temp = maxHeap[(curr*2)];
			maxHeap[curr*2] = maxHeap[curr-1];
			 maxHeap[curr-1] = temp;
			 curr = curr*2+1;
		}
		}
	}
	

}
