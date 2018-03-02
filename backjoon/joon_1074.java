package backjoon;

import java.util.Scanner;

public class joon_1074 {
	static int N;
	static int R;
	static int C;
	static int cnt = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		R = scan.nextInt();
		C = scan.nextInt();
		
		fnc((int) Math.pow(2, N),0,0);
		
	}
	
	public static void fnc(int n, int r, int c) {
		if(n==2) { // 2*2 size 일 때 갯수 센다.
			
			if(r==R && c==C) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			
			if(r==R && c+1==C) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			if(r+1==R && c==C) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			if(r+1==R && c+1==C) {
				System.out.println(cnt);
				return;
			}
			cnt++;
			return;
		}
		
		fnc(n/2, r, c);
		fnc(n/2, r, c+n/2);
		fnc(n/2, r+n/2, c);
		fnc(n/2, r+n/2, c+n/2);
	}

}
