package com.ibm.bss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxLengthSubstring {

	public static void main(String[] args) {
		//abcbaef. =  bcaef
		
		String s = "abcbaecdf";
		
		int ptr1 =0;
		
		String subSet = "a";
		int length = Integer.MIN_VALUE;
		String resultantString = "";
		
		Map<Character,Integer> nonDuplicateChar = new HashMap<>();
		//Set<String> sub = new HashSet<>();
		nonDuplicateChar.put(s.charAt(0),0);
		
		for(int ptr2 = 0; ptr2 < s.length() -1 ; ptr2++ ) {
			
			if(nonDuplicateChar.get(s.charAt(ptr2+1)) == null || nonDuplicateChar.get(s.charAt(ptr2+1)) < ptr1) {
				subSet = subSet + s.charAt(ptr2+1);
				nonDuplicateChar.put(s.charAt(ptr2+1),ptr2+1);
				//++ptr2;
			}else {
				if(subSet.length() > length) {
					length = subSet.length();
					resultantString = subSet;
				}
				
				subSet = s.substring(nonDuplicateChar.get(s.charAt(ptr2+1)) +1, ptr2+2);
				ptr1 = nonDuplicateChar.get(s.charAt(ptr2+1)) + 1;
				nonDuplicateChar.put(s.charAt(ptr2+1),ptr2+1);
			}
		}
		
		if(subSet.length() > length) {
			resultantString = subSet;
		}
		
		System.out.println("Max length substring is " + resultantString);

	}
	

}
