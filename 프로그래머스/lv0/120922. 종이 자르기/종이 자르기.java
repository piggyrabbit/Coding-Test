class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        if (M > N) {
            answer += M - 1;
            answer += M * (N-1);
        }
        if (M < N) {
            answer += N - 1;
            answer += N * (M-1);
        }
        if (M == N) {
            answer += M - 1;
            answer += M * (N-1);
        }
        return answer;
    }
}