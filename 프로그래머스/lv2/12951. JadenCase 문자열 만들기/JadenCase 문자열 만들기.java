class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        
        String[] arr = s.split("");
        
        for (String str : arr) {
            if (answer.length() == 0) answer += str.toUpperCase();
            else if (answer.length() != 0 && answer.substring(answer.length() - 1, answer.length()).equals(" ")) {
                str = str.toUpperCase();
                answer += str;
            }
            else answer += str;
        }
        return answer;
    }
}