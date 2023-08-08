class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        int previous = numLog[0];
        
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - previous == 1) {
                answer += "w";
                previous = numLog[i];
            }
            if (numLog[i] - previous == -1) {
                answer += "s";
                previous = numLog[i];
            }
            if (numLog[i] - previous == 10) {
                answer += "d";
                previous = numLog[i];
            }
            if (numLog[i] - previous == -10) {
                answer += "a";
                previous = numLog[i];
            }
        }
        return answer;
    }
}