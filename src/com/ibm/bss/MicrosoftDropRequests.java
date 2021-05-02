package com.ibm.bss;

import java.util.Arrays;

public class MicrosoftDropRequests {

	public static void main(String[] args) {
		int requestTimeArr[] = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 11, 11, 11 };
		// System.out.println("Length is"+arr.length);
//		int start[] = new int[arr[arr.length-1]+1];
//		int end[] = new int[arr[arr.length-1]+1];
//	
//		Arrays.fill(start, -1);
//		Arrays.fill(end, -1);
//		
//		int last1 = 0;
//		int last10 = 0;
//		int last60 = 0;
//		int dropped =0;
//		
//		int time = 1;
//		int previous = 0;
//		for(int i = 0; i < arr.length;i++) {
//			if(arr[i] != previous) {
//				start[arr[i]]= i;
//				previous = arr[i];
//				if(i > 0) {
//					end[arr[i-1]] = i-1;
//				}		
//			}
//			
//		}
//		end[previous] = arr.length-1;
//	
//		for(int i = 1;i<arr.length; i++) {
//			if(i > 0) {
//				if(start[arr[i]] != -1 && end[arr[i]] != -1 && end[arr[i]] - start[arr[i]] >= 3)
//				dropped += 1;
//			}
//			
//			if(arr[i] < 10) {
//				if(start[arr[1]] != -1 && end[arr[i]] != -1 && end[arr[i]] - start[arr[i]-9] >= 20) {   
//					dropped += 1;
//				}
//			}
//			
//			if(arr[i] >= 10) {
//				if(start[arr[i]-9] != -1 && end[arr[i]] != -1 && end[arr[i]] - start[arr[i]-9] >= 20) {   
//					dropped += 1;
//				}
//			}
//			
//			if(start[i] >= 60) {
//				if(start[i]-59 != -1 && end[i] != -1 && end[i] - start[i]-59 >= 60)
//					dropped += end[i] - start[i-59] - 59;
//			}
//		}
//		
//		System.out.println("Packets dropped is"+dropped);

		int dropped = 0;

		for (int i = 0; i < requestTimeArr.length; i++) {

			if (i > 2 && requestTimeArr[i] == requestTimeArr[i - 3]) {
				++dropped;
			} else if (i > 19 && (requestTimeArr[i] - requestTimeArr[i - 20]) < 10) {
				++dropped;
			} else if (i > 59 && (requestTimeArr[i] - requestTimeArr[i - 60]) < 60) {
				++dropped;
			}
		}
		System.out.println("Packets dropped is" + dropped);
	}

}
