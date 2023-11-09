class Solution {
    public int solution(int n) {
        // 피보나치 수열을 저장할 배열
        int[] fib = new int[n + 1];
        
        // 초기값 설정
        fib[0] = 0;
        fib[1] = 1;
        
        // 피보나치 수열 계산
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567;
        }
        
        // n번째 피보나치 수를 1234567로 나눈 나머지 반환
        return fib[n];
    }
}
