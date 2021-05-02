package test;

/*
 * 
 * m*n 0 and 1s
 * Print max square of 1s
 * 4 * 5
 * 0 0 0 0 0 
 * 0 1 1 1 1
 * 1 1 1 1 1
 * 1 1 1 1 0
 */
public class Accolite {
	static int[][] arr = { {0, 0, 0, 0, 0 },
					{0, 1, 1, 1, 1}, 	
					{1, 1, 1, 1, 1}, 	
					{1, 1, 1, 1, 0}};
	
	static int size = 0;
	
	public static void main(String a[]) {
		
		size = findMaxSize(arr);
		//System.out.println(Integer.MAX_VALUE);
		System.out.println("Max size of square is"+  size);
		
		
	}

	private static int findMaxSize(int[][] arr2) {
		int max = Integer.MIN_VALUE;
 		int size = 0;
		
		for(int i =0; i < arr2.length; i++) {
			for(int j = 0; j< arr2[i].length ; j++) {
				size = findSize(arr2, i , j, arr2.length - i, arr2[i].length - j);
			}
			if(size > max) {
				max = size;
			}
		}
		return max;
	}

	private static int findSize(int[][] ar, int row, int col, int maxrow, int maxCol) {
		
		int count = 0;
		int min = Integer.MAX_VALUE;
		
			
				for(int i =row; i < row + maxrow ; i++) {
					count = 0;
					for(int j = col; j< col + maxCol ; j++) {
						
						if(ar[i][j] == 1) {
							count = count +1;
						}else {
							break;
						}
					}
					
					
					if(count < min) {
						min = count;
					}
					
				}
				
				if(count > maxrow || count > maxCol) {
					count = maxrow;
				}
				

		
		return min;
	}
	

}
