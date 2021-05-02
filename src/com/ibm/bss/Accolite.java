package com.ibm.bss;

public class Accolite {
    
    public static void main(String ar[]){
        
        int arr[] = {1, 4, 100, 9, 1};
        int previous, next;
        
        int counter = 0;
        
         if(arr[0] > arr[1]){
            arr[0] = arr[1];
            counter = counter + Math.abs(arr[0] - arr[1]);
        }
        
        for(int i = 1; i < arr.length-1; i++){
             
            if(arr[i] > arr[i-1]){
                continue;
            }
            previous = Math.abs(arr[i] - arr[i-1]);
            next = Math.abs(arr[i+1] - arr[i]);
           
            
            if( previous > next){
                counter = counter + next;
                arr[i] = arr[i+1];
            }else if ( previous < next){
                counter = counter + previous;
                arr[i] = arr[i-1];
            }
        }
    
        if(arr[arr.length-1] < arr[arr.length-2]){
      
            System.out.println("C" +counter);
            counter = counter + Math.abs(arr[arr.length-1] - arr[arr.length-2]);
            System.out.println("C" + counter);
            arr[arr.length-1] = arr[arr.length-2];
        }

        for (int a:arr){
            System.out.print( a + "  ");
            
        }
        System.out.println();
    System.out.println("Counter is" + counter);
}
}
