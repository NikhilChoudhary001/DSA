package com.ibm.bss;

import java.util.HashMap;
import java.util.Map;

public class Arrays {

	public static void main(String[] args) {
	
		int arr[] = {0, 0, 0 , 7 , 8};
		
		int result[] = new int[arr.length];
		boolean flag = false;
		int count = 0;
		
		int mul = 1;
		
		//Map<Integer, Integer> m = new HashMap<>();
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				mul = mul * arr[i];
			}else {
				count = count + 1;
				flag = true;
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && flag ) {
				result[i] = 0;
			}if(arr[i] == 0 && flag && count > 1) {
				result[i] = 0;
			}else if(arr[i] != 0 && !flag){
				result[i] = mul / arr[i];
			}else {
				result[i] = mul;
			}
			
		}
		
		for(int i : result) {
			System.out.println(i + " ");
		}
	}

}
