class Solution {
    public int solution(int n) {
        int countOnes = Integer.bitCount(n); // n을 2진수로 변환했을 때 1의 개수를 계산

        while (true) {
            n++; // n을 1씩 증가시킴
            if (Integer.bitCount(n) == countOnes) {
                return n; // 1의 개수가 같은 다음 큰 숫자를 찾으면 반환
            }
        }
    }
}
