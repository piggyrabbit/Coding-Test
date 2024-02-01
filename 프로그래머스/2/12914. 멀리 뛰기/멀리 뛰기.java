public class Solution {
    public long solution(int n) {
        int[] dp = new int[2001];
        return calculateFibonacci(dp, n);
    }

    private int calculateFibonacci(int[] dp, int num) {
        if (num <= 2) {
            return num;
        }

        if (dp[num] == 0) {
            dp[num] = (calculateFibonacci(dp, num - 1) + calculateFibonacci(dp, num - 2)) % 1234567;
        }

        return dp[num];
    }
}
