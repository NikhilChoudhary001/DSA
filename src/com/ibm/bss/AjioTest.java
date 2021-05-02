package com.ibm.bss;

import java.io.IOException;
import java.util.Arrays;

public class AjioTest {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int T = Integer.parseInt(br.readLine().trim());
//        for(int t_i=0; t_i<T; t_i++)
//        {
//            String[] str = br.readLine().split(" ");
//            int x = Integer.parseInt(str[0]);
//            int y = Integer.parseInt(str[1]);
//
//            String out_ = solve(y, x);
//            System.out.println(out_);
//         }
//
//         wr.close();
//         br.close();
    	String out_ = solve(4L, 6L);
    	System.out.println(out_);
    }
    
    
    
    static String solve(long y, long x){


        long dp[][] = new long[100][100];
        for(long[] row : dp){
            Arrays.fill(row,-1L);
        }
        // for(long i = 0; i < dp[0].length;i++){
        //     System.out.println(dp[0][i]);
        // }
        long l = 99999L;
        
        int p = (int)l;
        System.out.println(p);
        		
        detect(dp, y, x, 1,1);
        
        if(dp[(int)y][(int)x] == 1) {
       	 return "Yes";
       }else {
       	return "No";
       }
        
    }

    static void detect(long dp[][], long y, long x, long i, long j){
         if(i+j == y && j==x){
                dp[(int)y][(int)x] = 1;
            }else if(i == y && i+j == x){
                dp[(int)y][(int)x] = 1;
            }
            
            if((i <= y && j < x) || (i < y && j <= x)) {
                detect(dp, y, x, i+j, j);
                detect(dp, y, x, i, i+j);
            }
        }
            
    }