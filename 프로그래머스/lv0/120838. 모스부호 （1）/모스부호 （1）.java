import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] arr = letter.split(" ");
        
        String[] moss = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < moss.length; j++) {
                if (arr[i].equals(moss[j])) {
                    arr[i] = (char)('a' + j) + "";
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        
        return answer;
    }
}