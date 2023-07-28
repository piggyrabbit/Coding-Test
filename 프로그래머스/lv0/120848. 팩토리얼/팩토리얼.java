class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            answer++;
            int res = 1;
            for (int i = 1; i <= answer; i++) {
                res *= i;
            }
            
            if (res > n) break; 
        }
        
        return answer - 1;
    }
}