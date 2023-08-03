class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int cnt = 1;
        
        int x = 0;
        int y = 0;
        
        String direction = "x+";
        
        // x+ > y-
        // y+ > x+
        // x- > y+
        // y- > x-
        
        while(true) {
            answer[y][x] = cnt;
            
            if (cnt == n * n) break;
            
            // 일단 x 늘리는 것부터 시작
            // x가 인덱스를 벗어나거나 이동하려는 인덱스의 값이 0이 아닐 경우 방향 전환
            
            if (direction.equals("x+")) {
                if (x+1 >= n || answer[y][x+1] != 0) {
                    direction = "y+";
                }
                else {
                    x++;
                    cnt++;
                }
            }
            else if (direction.equals("x-")) {
                if (x - 1 < 0 || answer[y][x-1] != 0) {
                    direction = "y-";
                }
                else {
                    x--;
                    cnt++;
                }
            }
            else if (direction.equals("y+")) {
                if (y+1 >= n || answer[y+1][x] != 0) {
                    direction = "x-";
                }
                else {
                    y++;
                    cnt++;
                }
            }
            else if (direction.equals("y-")) {
                if (y - 1 < 0 || answer[y-1][x] != 0) {
                    direction = "x+";
                }
                else {
                    y--;
                    cnt++;
                }
            } 
        }
        
        return answer;
    }
}