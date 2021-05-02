package com.ibm.bss;

import java.util.HashSet;
import java.util.Set;

//Input: s = "babad"
//dabab
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
//Example 3:
//
//Input: s = "a"
//Output: "a"
//Example 4:
//
//Input: s = "ac"
//Output: "a"
//
//Input: s = "abbacdaadcf"
//fcdaadcabba
//Output: "cdaadc"
//	
//	
//	input: aecdbbdceacdaadcf
//	
//	
//	output: aecdbbdcea
	
public class BroadCom {
	
	static String result = "";
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		
		String s1 = "babad";
		String s2 = reverse(s1);
		
		findLongestSubString(s1,s2);

	}
	
	public static String reverse(String s) {
		String newS = "";
		for(int i = s.length() ; i >= 0; i--) {
			newS = newS + s.charAt(i);
		}
		
		return newS;
	}
	
	static String findLongestSubString(String s1, String s2) {
		
		if(s1.length() == 0 && s2.length() == 0) {
			return "";
		}
		
		if(s1.charAt(0) == s2.charAt(0)) {
			
			result += s1.charAt(0);
			
		}else {
		
			Math.max(findLongestSubString(s1, s2.substring(0,s2.length()-1)) , findLongestSubString(s1.substring(0,s1.length()-1), s2));
		}

		return r
		
	}
	


}
