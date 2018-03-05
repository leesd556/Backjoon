package backjoon;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class kakao_map {

	public static void main(String[] args) {
		int N;
		int[] arr1, arr2;
		int[][] a, b;
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		arr1 = new int[N];
		arr2 = new int[N];
		
		for(int i = 0 ; i < N ; i ++) {
			arr1[i] = scan.nextInt();
		}

		for(int i = 0 ; i < N ; i ++) {
			arr2[i] = scan.nextInt();
		}
		
		a = new int[N][N];
		b = new int[N][N];
		
		for(int i = 0 ; i < N ; i ++) {
			int share = arr1[i];
			int rest = 0;
			String st ="";
			for(int j = 0 ; j < N ; j ++) {
				rest = share%2;
				share = share/2;
				st += Integer.toString(rest);
			}
			
			int cnt = 0;
			for(int j = N-1 ; j >= 0 ; j--) {
				if(N-(j+1) == st.length()) {
					a[i][j] = 0;
				}
				else {
					a[i][j] = st.charAt(cnt)-'0';
					cnt++;
				}
			}
		}
		
		for(int i = 0 ; i < N ; i ++) {
			int share = arr2[i];
			int rest = 0;
			String st ="";
			for(int j = 0 ; j < N ; j ++) {
				rest = share%2;
				share = share/2;
				st += Integer.toString(rest);
			}
			int cnt = 0;
			for(int j = N-1 ; j >= 0 ; j--) {
				if(N-(j+1) == st.length()) {
					b[i][j] = 0;
				}
				else {
					b[i][j] = st.charAt(cnt)-'0';
					cnt++;
				}
			}
		}
		
		String[] arr3 = new String[N];
		for(int i = 0 ; i < N ; i ++) {
			arr3[i]="";
			for(int j = 0 ; j < N ; j ++) {
				if(a[i][j] == 1 || b[i][j] == 1) {
					arr3[i] +='#';
				}
				else
					arr3[i] +=' ';
			}
		}
		
		System.out.println(Arrays.toString(arr3));
		
	}

}
