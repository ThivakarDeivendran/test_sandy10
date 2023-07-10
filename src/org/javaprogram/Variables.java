//package org.javaprogram;
//
//public class Variables {
//	
//	public static void main(String[] args)
//	{
//		int N = A.length;
//        int maxSum = 0;
//        
//        for (int i = 0; i < N - 1; i++) {
//            int sum1 = maxSumTwoTiles(A, 0, i);
//            int sum2 = maxSumTwoTiles(A, i + 1, N - 1);
//            int sum3 = maxSumThreeTiles(A, 0, i, i + 1, N - 1);
//            int totalSum = sum1 + sum2 + sum3;
//            
//            maxSum = Math.max(maxSum, totalSum);
//        }
//        
//        return maxSum;
//    }
//    
//    private int maxSumTwoTiles(int[] A, int start, int end) {
//        int N = end - start + 1;
//        int[] dp = new int[N];
//        dp[0] = A[start];
//        dp[1] = Math.max(A[start], A[start + 1]);
//        
//        for (int i = 2; i < N; i++) {
//            dp[i] = Math.max(dp[i - 1], dp[i - 2] + A[start + i]);
//        }
//        
//        return dp[N - 1];
//    }
//    
//    private int maxSumThreeTiles(int[] A, int start1, int end1, int start2, int end2) {
//        int sum1 = maxSumTwoTiles(A, start1, end1);
//        int sum2 = maxSumTwoTiles(A, start2, end2);
//        
//        return sum1 + sum2;
//		
//	}
//
//}
