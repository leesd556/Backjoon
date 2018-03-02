package backjoon;

import java.util.Scanner;

public class joon_1085 {

	public static void main(String[] args) {
		
		int[] x = new int[4];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < 4; i ++)
		x[i] = scan.nextInt();

		
		
		int min = x[0];
		if(min > x[0] - 0)
			min = x[0];
		if(min > x[2] - x[0])
			min = x[2] - x[0];
		if(min > x[1] - 0)
			min = x[1];
		if(min > x[3] - x[1])
			min = x[3] - x[1];
		
		System.out.println(min);
	}

}
