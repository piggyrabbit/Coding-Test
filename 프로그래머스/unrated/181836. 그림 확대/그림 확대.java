import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        // k배로 늘리기
        for (int i = 0; i < answer.length; i++) {
            
            for (int j = 0; j < picture[i/k].length(); j++) {
                for (int p = 0; p < k; p++) {
                    answer[i] += picture[i/k].charAt(j) + "";   
                }
            }
        }
        
        return answer;
    }
}