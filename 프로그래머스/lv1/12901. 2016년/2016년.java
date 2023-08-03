class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 2월 29일까지 있음
        
        int total = 0;
        
        for (int i = 1; i < a; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                total += 31;
            }
            else if (i == 2) {
                total += 29;
            }
            else {
                total += 30;
            }
        }
        
        total += b - 1;
        
        total %= 7;
        
        if (total == 0) answer = "FRI";
        if (total == 1) answer = "SAT";
        if (total == 2) answer = "SUN";
        if (total == 3) answer = "MON";
        if (total == 4) answer = "TUE";
        if (total == 5) answer = "WED";
        if (total == 6) answer = "THU";
        
        return answer;
    }
}