class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for (int i = 0; i < citations.length + 1; i++) {
            int cnt = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) cnt++;
            }
            
            if (cnt >= i && (citations.length - cnt) <= i) {
                answer = i;
            }
            else break;
        }
        
        return answer;
    }
}