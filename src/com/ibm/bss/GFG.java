package com.ibm.bss;

//Java implementation of the approach 
import java.util.*; 

public class GFG 
{ 

//Function to return the minimum number 
//of given operations required 
//to sort the array 
static int getMinimumOps(Vector<Integer> ar) 
{ 
	// Number of elements in the array 
	int n = ar.size(); 

	// Smallest element in the array 
	int small = Collections.min(ar); 

	// Largest element in the array 
	int large = Collections.max(ar); 

	/* 
		dp(i, j) represents the minimum number 
		of operations needed to make the 
		array[0 .. i] sorted in non-decreasing 
		order given that ith element is j 
	*/
	int [][]dp = new int[n][large + 1]; 

	// Fill the dp[]][ array for base cases 
	for (int j = small; j <= large; j++) 
	{ 
		dp[0][j] = Math.abs(ar.get(0) - j); 
	} 

	/* 
		Using results for the first (i - 1) 
		elements, calculate the result 
		for the ith element 
	*/
	for (int i = 1; i < n; i++) 
	{ 
		int minimum = Integer.MAX_VALUE; 
		for (int j = small; j <= large; j++) 
		{ 

			/* 
			If the ith element is j then we can have 
			any value from small to j for the i-1 th 
			element 
			We choose the one that requires the 
			minimum operations 
			*/
			minimum = Math.min(minimum, dp[i - 1][j]);
			dp[i][j] = minimum + Math.abs(ar.get(i) - j);
		} 
	} 
	
	for (int i = 0; i < dp.length; i++) {
		for (int j = 0; j < dp[i].length; j++) {
			System.out.print(dp[i][j] + "  ");
		}
		System.out.println();
	}

	/* 
		If we made the (n - 1)th element equal to j 
		we required dp(n-1, j) operations 
		We choose the minimum among all possible 
		dp(n-1, j) where j goes from small to large 
	*/
	int ans = Integer.MAX_VALUE; 
	for (int j = small; j <= large; j++) 
	{ 
		ans = Math.min(ans, dp[n - 1][j]); 
	} 
	return ans;
} 

//Driver code 
public static void main(String[] args) 
{ 
	Integer []arr = {2, 4, 10, 9, 2};
	Vector<Integer> ar = new Vector<>(Arrays.asList(arr)); 

	System.out.println(getMinimumOps(ar)); 
} 
} 

//This code is contributed by 29AjayKumar 

