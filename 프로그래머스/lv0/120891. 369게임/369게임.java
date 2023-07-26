class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = "" + order;
        
        for(char ch : str.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}