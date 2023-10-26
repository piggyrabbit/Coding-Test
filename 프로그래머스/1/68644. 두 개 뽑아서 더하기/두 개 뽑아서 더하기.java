import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int result = numbers[i] + numbers[j];
                
                int num = 0;
                
                for (int k = 0; k < answer.size(); k++) {
                    if (answer.get(k) == result) num++;
                }
                
                if (num == 0) answer.add(result);
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}