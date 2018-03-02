package backjoon;

import java.util.Scanner;

public class page {

	public static void main(String[] args) {
		int[][] square;
		String s;
		int N, M;
		int size = 0;
		
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		
		square = new int[N][M];
		
		
		for(int i = 0 ; i < N ; i++) {
			s = scan.next();
			for(int j = 0 ; j < M ; j++)
				square[i][j] = s.charAt(j)-'0';
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				if(N>=M) {
					for(int k = 1 ; k < M - 1 ; k++ )
						if((i+k<N) && (j+k<M))
						if(square[i][j] == square[i+k][j+k] && (i+k>=0 && j+k>=0)) {
							if(square[i+k][j] == square[i][j+k] &&(i+k>=0 && j+k>=0)) {
								if((k+1)*(k+1)>size)
									size = (k+1)*(k+1);
							}
						}
				}
				else {
					for(int k = 1 ; k < N - 1 ; k++ )
						if((i+k<N) && (j+k<M))
						if(square[i][j] == square[i+k][j+k] && (i+k>=0 && j+k>=0)) {
							if(square[i+k][j] == square[i][j+k] &&(i+k>=0 && j+k>=0)) {
								if((k+1)*(k+1)>size)
									size = (k+1)*(k+1);
							}
						}
					
				}
					
				
			}
		}
		
		System.out.println(size);
		
		
		
	}

}
