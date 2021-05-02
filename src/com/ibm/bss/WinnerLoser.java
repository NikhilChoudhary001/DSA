package com.ibm.bss;

import java.util.HashMap;
import java.util.Map;

public class WinnerLoser {

	public static void main(String[] args) {
		String s = "aaabbbcceeff";
		
		String res = checkWinnerLoser(s);
		
		//System.out.println("Res is" + res);
		if(res.equals("winner losser")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		//testMain();
		
		String a = "XYZ MYX";
		String b = "XYZ MYX";
		
		if(a == b) {
			System.out.println("passed");
		}

	}
	
	static String checkWinnerLoser(String s){
Map<Character, Integer> m = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			}else {
				m.put(s.charAt(i), 1);
			}
		}
		
		//Set<Character> set = new HashSet<>();
		
		Character winner = '\0';
		Character loser  = '*';
		
		int maxCount = Integer.MIN_VALUE;
		int minCount = Integer.MAX_VALUE;
		
		int max = 0;
		int min = 0;
		
		for(Map.Entry<Character, Integer> val : m.entrySet()) {
			if(val.getValue() > maxCount) {
				maxCount = val.getValue();
			}
			
			if(val.getValue() < minCount) {
				minCount = val.getValue();
			}
		}
		
		for(Map.Entry<Character, Integer> val : m.entrySet()) {
			if(maxCount == val.getValue()) {
				max = max +1;
				winner = val.getKey();
			}
			if(minCount == val.getValue()) {
				min = min +1;
				loser = val.getKey();
			}
		}
		
		String result;
		
		if(max == 1) {
			System.out.println("Winner is " + winner);
			result = "winner";
		}else {
			System.out.println("Winner does not exists");
			result = "winnernotexists";
		}
		
		if(min == 1) {
			System.out.println("Loser is " + loser);
			result = result + " losser";
		}else {
			System.out.println("Loser does not exists");
			result += " lossernotexists";
		}
		
		return result;
		
		
	}
	
	

}
