class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String str = s.charAt(i) + "";
            
            if(str.equals(" ")) {
                answer += str;
                cnt = 0;
            }
            else {
                cnt++;
                if (cnt % 2 == 0) {
                    answer += str.toLowerCase();
                }
                if (cnt % 2 == 1) {
                    answer += str.toUpperCase();
                }
            }
        }
        
        return answer;
    }
}