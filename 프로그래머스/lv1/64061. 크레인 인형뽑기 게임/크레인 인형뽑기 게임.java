import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            // 크레인이 이동한 위치
            int move = moves[i];
            
            for (int j = 0; j < board.length; j++) {
                // 이동한 위치에 인형이 있을 경우
                if (board[j][move - 1] != 0) {
                    
                    
                    if (stack.isEmpty()) stack.push(board[j][move - 1]);
                    else {
                        System.out.println(stack.peek() + "" + board[j][move-1]);
                        if (stack.peek() == board[j][move - 1]) {
                            answer += 2;
                            stack.pop();
                        }
                        else {
                            stack.push(board[j][move - 1]);
                        }
                    }
                    
                    // 인형 치우기
                    board[j][move - 1] = 0;
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}