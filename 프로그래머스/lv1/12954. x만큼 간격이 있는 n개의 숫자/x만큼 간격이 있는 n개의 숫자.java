class Solution {
    public double[] solution(int x, int n) {
        double[] answer = new double[n];
        
        answer[0] = x;
        
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}