import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 1) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 3);
            }
            if (choices[i] == 2) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 2);
            }
            if (choices[i] == 3) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 1);
            }
            if (choices[i] == 5) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 1);
            }
            if (choices[i] == 6) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 2);
            }
            if (choices[i] == 7) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 3);
            }
        }
        
        if (map.get('R') >= map.get('T')) answer += 'R';
        else answer += 'T';
        
        if (map.get('C') >= map.get('F')) answer += 'C';
        else answer += 'F';
        
        if (map.get('J') >= map.get('M')) answer += 'J';
        else answer += 'M';
        
        if (map.get('A') >= map.get('N')) answer += 'A';
        else answer += 'N';
        return answer;
    }
}