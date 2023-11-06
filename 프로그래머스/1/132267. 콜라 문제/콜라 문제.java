class Solution {
    public int solution(int a, int b, int n) {
        int bottle = n;
        int totalCola = 0; // 상빈이가 받을 수 있는 모든 콜라의 병 수

        while (bottle >= a) {
            int newCola = (bottle / a) * b; // 주는 콜라의 수
            totalCola += newCola; // 받은 콜라를 더함
            bottle = newCola + (bottle % a); // 빈 병의 수를 업데이트
        }

        return totalCola;
    }
}
