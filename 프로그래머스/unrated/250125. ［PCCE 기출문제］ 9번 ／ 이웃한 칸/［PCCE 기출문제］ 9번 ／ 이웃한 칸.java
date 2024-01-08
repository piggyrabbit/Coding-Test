class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String str = board[h][w];
        
        int height = h;
        int width = w - 1;
        
        if (height >= 0 && width >= 0) {
            if (str.equals(board[height][width])) answer++;
        }
        
        height = h;
        width = w + 1;
        
        if (height >= 0 && width < board[0].length) {
            if (str.equals(board[height][width])) answer++;
        }
        
        height = h + 1;
        width = w;
        
        if (width >= 0 && height < board.length) {
            if (str.equals(board[height][width])) answer++;
        }
        
        height = h - 1;
        width = w;
        
        if (width < board[0].length && height >= 0) {
            if (str.equals(board[height][width])) answer++;
        }
        
        
        return answer;
    }
}