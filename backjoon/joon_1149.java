package backjoon;

import java.util.Scanner;

public class joon_1149 {

	public static void main(String[] args) {
		int T; //테스트 케이스
		int N; //열 갯수
		int[][] st; //스티커
		int[][] dp; //다이나믹 프로그래밍
		int[] result;
		Scanner scan = new Scanner(System.in);
		
		T = scan.nextInt();
		
		result = new int[T];
		
		for(int i = 0 ; i < T ; i ++) {
			N = scan.nextInt();
			st = new int[2][N];
			dp = new int[2][N];
			for(int j = 0 ; j < N ; j ++) {
				st[0][j] = scan.nextInt();
			}
			for(int j = 0 ; j < N ; j ++) {
				st[1][j] = scan.nextInt();
			}
			
			
			dp[0][0] = st[0][0];
			dp[1][0] = st[1][0];
			
			dp[0][1] = st[1][0]+st[0][1];
			dp[1][1] = st[0][0]+st[1][1];
			

			int n = 2;
			while(true) {
				if(N-1<n)
					break;
				dp[0][n] = Math.max(dp[1][n-1], dp[1][n-2])+st[0][n];
				dp[1][n] = Math.max(dp[0][n-1], dp[0][n-2])+st[1][n];
				
				n++;
			}
			
			
			result[i] = Math.max(dp[0][N-1], dp[1][N-1]);
			
		}
		
		for(int i = 0 ; i < T ; i ++)
			System.out.println(result[i]);
	
		

	}

}
