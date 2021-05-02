package com.ibm.bss;

import java.util.Arrays;

public class lcsLength {
	static String s1 = "aieefklaed";
	static String s2= "klaied";
	
	static int dp[][] = new int[s1.length()+1][s2.length()+1];

	public static void main(String[] args) {
		
		for(int[] i : dp) {
			Arrays.fill(i, -1);
		}
		for(int i = 0; i < dp[0].length ; i++) {
			dp[0][i] = 0;
		}
	
		for(int j = 0; j < dp.length ; j++) {
			dp[j][0] = 0;
		}
		
		for(int[] i : dp) {
			for(int j : i) {
				System.out.println(j + " ");
			}
			System.out.println();
		}
		
		findLcs(s1, s2);

		System.out.println("LCS length is"+ dp[s1.length()][s2.length()]);
		
	}

	private static void findLcs(String s1, String s2) {
		
		for(int i = 1; i < dp.length ; i++) {
			for(int j = 1; j < dp[i].length ; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	
	}
	
	

}
