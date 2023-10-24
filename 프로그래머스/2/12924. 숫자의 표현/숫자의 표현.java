class Solution {
    public int solution(int n) {
        int answer = 0;
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            total = 0;
            for (int j = i; j <= n; j++) {
                total += j;
                if (total == n) {
                    answer++;
                    break;
                }
                if (total > n) break;
            }
        }
        
        return answer;
    }
}