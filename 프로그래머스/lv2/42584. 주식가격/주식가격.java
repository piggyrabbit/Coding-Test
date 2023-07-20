class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int cnt = -1;
            
            for (int j = i; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) break;
                }
            answer[i] = cnt;
        }
        
        return answer;
    }
}