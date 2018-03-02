package backjoon;

import java.util.Scanner;

public class joon_11722 {

	public static void main(String[] args) {
		int N;
		int[] A;
		int[] cnt;
		int pivot = 0;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		A = new int[N];
		
		for(int i = 0 ; i < N ; i ++)
			A[i] = scan.nextInt();
		
		cnt = new int[N];
	
		for(int i = 0 ; i < N ; i ++)
			cnt[i]=1;
		
		for(int i = N-1 ; i > 0 ; i --) {
			int min = A[i];
			pivot = i;
			for(int j = i ; j < N ; j++) {
				if(min > A[j]) {  //여기서 보다 작은수와, 제일 큰 cnt를 찾아야 한다.
					min = A[j];
					pivot = j;
					break;
				}
			}
			if(i!=0 && i!=N-1)
			cnt[i]+=cnt[pivot];
		}
		
		max = cnt[0];
		for(int i = 0 ; i < N ; i ++)
			if(max < cnt[i])
				max = cnt[i];
		
		System.out.println(max);
		
	}

}
