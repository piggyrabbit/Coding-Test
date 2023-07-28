class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int p = i; p <= j; p++) {
            String str = p + "";
            
            for (int l = 0; l < str.length(); l++) {
                if ((str.charAt(l) + "").equals(k + "")) {
                    answer++;
                }
            }
            
            }
        
        return answer;
    }
}