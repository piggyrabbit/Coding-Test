class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (char ch : my_string.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
                answer += ch;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
                answer += ch;
            }
        }
        
        return answer;
    }
}