package backjoon;

import java.util.Scanner;

public class kakao_dart {

	public static void main(String[] args) { //10점 없음
		String input;
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.next();
		
		int[] result = new int[3];
		
		int cnt = 0 ;
		for(int i = 0 ; i < input.length() ; i ++) { //result에 숫자 세팅
			int a = input.charAt(i)-'0';
			if(a>0 && a<10) {
				result[cnt] = a;
				cnt++;
			}
		}
		
		cnt = 0;
		for(int i = 0 ; i < input.length() ; i ++) {
			if(input.charAt(i)=='S') {
				cnt++;
			} else if(input.charAt(i)=='D') {
				result[cnt] =  (int) Math.pow(result[cnt], 2);
				cnt++;
			} else if(input.charAt(i)=='T') {
				result[cnt] =  (int) Math.pow(result[cnt], 3);
				cnt++;
			} else if(input.charAt(i)=='*') {
				if(i<3) {
					result[cnt-1]*=2; 
					continue;
					} 
				if(i<6) {
					result[cnt-2]*=2; 
					result[cnt-1]*=2;
					continue;
					} 
				if(i<9) {
					result[cnt-2]*=2; 
					result[cnt-1]*=2;
					continue;
					} 
			} else if(input.charAt(i)=='#') {
				if(i<3) {
					result[cnt-1]*=-1; 
					continue;
					} 
				if(i<6) {
					result[cnt-1]*=-1;
					continue;
					} 
				if(i<9) {
					result[cnt-1]*=-1;
					continue;
					} 
			}
		}
		
		
		for(int i = 1 ; i < 3 ; i ++)
			result[0]+=result[i];
		
		System.out.println(result[0]);
		

	}

}
