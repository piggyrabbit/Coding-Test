class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            answer++;
            
            if ((answer*6.0) / n == (answer*6) / n) break;
        }
        return answer;
    }
}