class Solution {
    public int solution(int n) {
        boolean[] sieve = new boolean[n + 1];
        int answer = 0;

        // 배열 초기화: 처음에는 모든 수를 소수로 간주합니다.
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        // 소수의 개수 세기
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                answer++;
            }
        }

        return answer;
    }
}
