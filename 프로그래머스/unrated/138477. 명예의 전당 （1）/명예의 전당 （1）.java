import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] result = new int[k];
        
        for (int i = 0; i < score.length; i++) {
            if (result[0] < score[i]) {
                result[0] = score[i];
                Arrays.sort(result);
            }
            
            
            if (i < k) {
                    answer[i] = result[k - i - 1];
            }
            else {
                    answer[i] = result[0];
            }
        }
        
        
        return answer;
    }
}