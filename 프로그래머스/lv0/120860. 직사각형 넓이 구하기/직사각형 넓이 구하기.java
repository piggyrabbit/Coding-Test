class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // x1, x2, y1, y2
        
        int x2 = 0;
        int y2 = 0;
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        
        if (dots[1][0] != x1) x2 = dots[1][0];
        if (dots[2][0] != x1) x2 = dots[2][0];
        if (dots[3][0] != x1) x2 = dots[3][0];
        
        if (dots[1][1] != y1) y2 = dots[1][1];
        if (dots[2][1] != y1) y2 = dots[2][1];
        if (dots[3][1] != y1) y2 = dots[3][1];
        
        answer = (x2 - x1) * (y2 - y1);
        
        if (answer < 0) answer = answer * -1;
        
        return answer;
    }
}