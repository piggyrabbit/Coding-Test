class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // ch가 공백일 경우
            if (ch == ' ') {
                answer += ch;
            }
            
            // ch가 소문자일 경우
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch + n);
                
                if (ch > 'z') ch = (char)(ch - 26);
                
                answer += ch;
            }
            
            // ch가 대문자일 경우
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + n);
                
                if (ch > 'Z') ch = (char)(ch - 26);
                
                answer += ch;
                
            }
        }
        return answer;
    }
}