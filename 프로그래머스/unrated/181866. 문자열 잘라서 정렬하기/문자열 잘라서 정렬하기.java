import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        answer = myString.split("x");
        
        Arrays.sort(answer);
        
        ArrayList<String> arr = new ArrayList<>();
        
        for (String str : answer) {
            if (!str.equals(""))
            arr.add(str);    
        }
        
        answer = new String[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
        
        
    }
}