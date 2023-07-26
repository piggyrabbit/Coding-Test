import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                answer += (char)(ch - 'A' + 'a');
            }
            else answer += ch;
        }
        
        char[] arr = answer.toCharArray();
        
        Arrays.sort(arr);
        
        answer = "";
        
        for (char ch : arr) {
            answer += ch;
        }
        return answer;
    }
}