class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        int length = s.length();

        while (index < length) {
            char x = s.charAt(index);
            int countX = 0;
            int countOther = 0;

            // x와 다른 문자의 개수가 같아질 때까지 또는 문자열의 끝에 도달할 때까지 반복
            while (index < length) {
                if (s.charAt(index) == x) {
                    countX++;
                } else {
                    countOther++;
                }

                // x와 다른 문자의 개수가 같아지면 루프 종료
                if (countX == countOther) {
                    break;
                }

                index++;
            }

            // 분리된 문자열의 개수 증가
            answer++;
            index++; // 다음 문자열로 넘어가기 위해 인덱스 증가
        }

        return answer;
    }
}
