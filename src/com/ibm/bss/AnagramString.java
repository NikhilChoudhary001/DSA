package com.ibm.bss;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = {"abc", "bhhg", "tyyy"};
		String[] s2 = {"abc", "bgee", "yyty"};
		
		int c[] = new int[256];
		
//		c['a'] = c['a'] + 1;
//		c['c'] = c['c'] + 1;
		
//		for (int i =0; i<256; i++) {
//			System.out.println(c[i]);
//		}
		
		int result[] = new int[s1.length];
		
		for(int i = 0; i< s1.length; i++) {
			if(s1[i].length() == s2[i].length()) {
				Arrays.fill(c, 0);
				for(int j=0; j< s1[i].length();j++) {
					c[s1[i].charAt(j)] = c[s1[i].charAt(j)] + 1;
					c[s2[i].charAt(j)] = c[s2[i].charAt(j)] - 1;
				}
				for (int k =0; k<256; k++) {
					if (c[k] > 0) {
						result[i] = result[i]  + c[k];
					}
					
				}
				
			} else {
				result[i] = -1;
			}
			
			
		}
		
		
		for(int i : result) {
			System.out.println(i + " ");
		}
		
		
	}

}
