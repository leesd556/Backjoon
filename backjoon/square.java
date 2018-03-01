package backjoon;

import java.util.Scanner;

public class square {

   public static void main(String[] args) {
      int[][] square;
      String s;
      int N, M;
      int size = 1;
      
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
               for(int k = 1 ; k < M ; k++ )
                  if((i+k<N) && (j+k<M))
                  if(square[i][j] == square[i+k][j+k] && square[i][j] == square[i][j+k] && square[i][j] == square[i+k][j]) {
                        if((k+1)*(k+1)>=size)
                           size = (k+1)*(k+1);
                  }
            }
            else {
            	
               for(int k = 1 ; k < N ; k++ )
                  if((i+k<N) && (j+k<M))
                      if(square[i][j] == square[i+k][j+k] && square[i][j] == square[i][j+k] && square[i][j] == square[i+k][j]) {
                        if((k+1)*(k+1)>=size)
                           size = (k+1)*(k+1);
                  }
               
            }
               
            
         }
      }
      
      System.out.print(size);
      
      
      
   }

}