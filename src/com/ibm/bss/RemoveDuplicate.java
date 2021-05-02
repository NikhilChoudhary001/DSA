package com.ibm.bss;

public class RemoveDuplicate {

	int arr[] = {12, 4, 7, 9, 4, 5, 7,2, 1};
	//12,4,7,9,5,2,1
	
	//int final = 12,4,7,9,5,2,1,-1,-1
	
	int finalArr[] = new int[arr.length];
	int dupArr[] = new int[arr.length];
	int count=0;
	boolean duplicate = false;
	
	for(int i = 0; i<arr.length-1; i++) {
		//duplicate = false;
		for(int j = i+1; j<arr.length; j++) {
			if(arr[i] == arr[j]) {
				//duplicate = true;
				dupArr[count] = arr[i];
				count = count+1;
				break;
			}
		}
		
	}
	
	// Original 
	
	for{
		for{
	}
		
		O(n2) + O(n2) 
	
}
