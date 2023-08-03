class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String total = a + "" + b;
        
        if (Integer.parseInt(total) > 2 * a * b) answer = Integer.parseInt(total);
        else answer = a * b * 2;
        
        return answer;
    }
}