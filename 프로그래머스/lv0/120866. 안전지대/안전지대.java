import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    
                    for (int p = i - 1; p <= i + 1; p++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (p < board.length && p >= 0) {
                                if (l < board[p].length && l >= 0) {
                                    if (board[p][l] != 1) board[p][l] = 2;
                                }
                            }            
                        }
                       }
                    }
                }
            }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (board[i][j] == 0) answer++;
            }
            System.out.println();
        }
        
        return answer;
    }
}