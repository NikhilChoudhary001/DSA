package com.ibm.bss;

public class Anagram{
    
    
	// String s1 = "Listen"
	// String s2 = "Silent"
	// Anagram?


	     public static void main(String []args){
	        String s1 = "LISTEN";
	        String s2 = "SILENT1";
	        
	     
	        
	        //String result = "";
	        
	        if(s1.length() == s2.length()) {
	            for(int i = 0; i< s1.length() ; i++){
	                char c = s1.charAt(i);
	                for(int j = 0; j < s2.length(); j++){
	                    if(s2.charAt(j) == c){  // c=I , s2 = SENT1
	                        s2 = s2.substring(0, j) + s2.substring(j+1,s2.length()); // S + ENT1
	                        break;
	                    }
	                }
	            }
	            
	            if(s2.length() == 0){
	                System.out.println("anagram string");
	            }
	        }else {
	            System.out.println("Not a anagram");
	        }
	        
	        
	     }
	}