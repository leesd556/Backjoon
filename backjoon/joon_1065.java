package backjoon;

import java.util.Scanner;

public class joon_1065 {

	public static void main(String[] args) {
		int[] N, M;
		String num;
		int cnt = 0 ;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.next();
		
		N = new int[num.length()];
		
		for(int i = 0 ; i < num.length() ; i++) {
			N[i] = num.charAt(i) - '0';
		}
		
		for(int i = 1 ; i <= Integer.parseInt(num) ; i++) {
			if(i/10==0)
				cnt++;
			else {
				M = new int[(int) (Math.log10(i)+1)];
				String a = Integer.toString(i);
				for(int k = 0 ; k < (int) (Math.log10(i)+1) ; k++) {
					M[k] = a.charAt(k) - '0';
				}
				temp = M[0] - M[1];
				
				for(int j = 0 ; j <(int) (Math.log10(i)+1)-1 ; j++) {
					
					if(temp == M[j] - M[j+1]) {
						if(j+1==(int) (Math.log10(i)+1)-1)
							cnt++;
					}
					else
						break;
					
				}
				
			}
				
		}
		System.out.println(cnt);

	}

}
