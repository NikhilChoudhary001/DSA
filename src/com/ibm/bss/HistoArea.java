package com.ibm.bss;

import java.util.Stack;

public class HistoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 4 , 4, 0 , 3, 3 , 4};
		int r;
		int max = Integer.MIN_VALUE;
		int currentvalue = 0;
		
		
		Stack<Integer> s = new Stack<Integer>();
		
		int i = 0;
	 while(i < a.length) {
		 if( s.empty() || a[i] >= a[s.peek()]) {
			 s.push(i++);
		 } else {
			 r = s.peek();
			 s.pop();
			 
			 currentvalue = a[r] * (s.empty()? 1 : i - s.peek()-1);
			 
			 if(currentvalue > max) {
				 max = currentvalue;
			 }		 
		 }
	 }
	 
	 while(s.empty() == false) {
		 r = s.peek();
		 s.pop();
		 
		 currentvalue = a[r] * (s.empty()? 1 : i - s.peek()-1);
		 
		 if(currentvalue > max) {
			 max = currentvalue;
		 }
	 }
	
	 System.out.println("Maximum area is " + max);
	}

}


