class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (participant[j].equals(completion[i])) {
                    participant[j] = "";
                    break;
                }
            }
        }
        
        for (int i = 0; i < participant.length; i++) {
            if (!participant[i].equals("")) {
                answer = participant[i];
            }
        }
        
        return answer;
    }
}