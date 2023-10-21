class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            for (int j = 0; j < i; j++) {
                if (s.charAt(i - j - 1) == ch) {
                    answer[i] = j + 1;
                    break;
                }
            }
            if (answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}