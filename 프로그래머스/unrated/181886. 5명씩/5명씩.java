import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i+=5) {
            list.add(names[i]);
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}