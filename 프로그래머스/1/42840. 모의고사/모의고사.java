import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        // 각 수포자의 찍는 패턴 정의
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 각 수포자의 정답 개수를 저장할 배열
        int[] correctCounts = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            // 각 수포자의 패턴과 정답을 비교하여 정답인지 확인
            if (answers[i] == pattern1[i % pattern1.length]) {
                correctCounts[0]++;
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                correctCounts[1]++;
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                correctCounts[2]++;
            }
        }
        
        // 가장 많은 문제를 맞힌 사람(들) 찾기
        int maxCorrect = Math.max(correctCounts[0], Math.max(correctCounts[1], correctCounts[2]));
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < correctCounts.length; i++) {
            if (correctCounts[i] == maxCorrect) {
                resultList.add(i + 1); // 인덱스를 사람 번호로 변환하여 리스트에 추가
            }
        }
        
        // 리스트를 배열로 변환
        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
