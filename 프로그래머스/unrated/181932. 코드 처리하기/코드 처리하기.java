class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            
            if (ch == '1') {
                if (mode == 0) mode = 1;
                else if (mode == 1) mode = 0;
                continue;
            }
            
            if (mode == 0) {
                if (i % 2 == 0) {
                    answer += ch;
                }
            }
            if (mode == 1) {
                if (i % 2 == 1) {
                    answer += ch;
                }
            }
        }
        
        if (answer.length() == 0) answer = "EMPTY";
        return answer;
    }
}