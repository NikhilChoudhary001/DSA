package com.ibm.bss;

public class Islands {

	public static void main(String[] args) {
		int grid = 

	}
	
	int total = 0;
	//static int[] neighbours= new int[4];
	
	getTotalIslands(){
		
		for(int i =0; i < row.lenght; i++) {
			for(int j =0; j < column.lenght; j++) {
				if(arr[i][j] == 1) {
					total = total + 1;
					checkRecursive(row, col);
				}
			}
		}
	}
	
	
	checkRecursive(int nextR , int nextCol){
		
		int[] neighbours= new int[4];
		
		neighbours[0] = nextR - 1;
		neighbours[1] = nextR + 1;
		neighbours[3] = nextCol - 1;
		neighbours[4] = nextCol +  1;
		
		if(nextR == 0 ) {
			neighbours[0] = nextR + 1;
			neighbours[1] = nextCol +   1;
		}else if (nextR == arr.length - 1) {
			
		}else if(nextCol == arr)
		
			for(int j = 0; j< neighbours.length ; j++ ) {
				if(arr[neighbours[j]][nextCol] == 1 && !flag[neighbours[j]][nextCol] & j<2) {
					flag[neighbours[j]][nextCol] = true;
					checkRecursive(neighbours[j] , nextCol);
				}else if(arr[nextR][neighbours[j]] == 1 && !flag[nextR][neighbours[j]] & j>=2) {
					flag[neighbours[j]][nextCol] = true;
					checkRecursive(nextR , neighbours[j]);
				}
			}
	
			
			
	}

}
