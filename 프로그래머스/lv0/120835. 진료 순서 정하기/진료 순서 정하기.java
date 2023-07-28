import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = emergency[i];
        }
        
        Arrays.sort(answer);
        
        int[] result = new int[emergency.length];
        
        for (int i = 0; i < answer.length; i++) {
            // answer[i] = emergency[j]면 emergency[j] = i + 1;
            for (int j = 0; j < emergency.length; j++) {
                if (answer[i] == emergency[j]) result[j] = emergency.length - i;
            }
        }
        
        return result;
    }
}