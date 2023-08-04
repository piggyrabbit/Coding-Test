class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length() - 1; i >= 0; i--) {
            if (myString.substring(i, myString.length()).contains(pat)) {
                answer += myString.substring(0, i + pat.length());
                break;
            }
        }
        
        return answer;
    }
}