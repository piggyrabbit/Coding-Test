class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int result1 = Integer.parseInt(a + "" + b);
        int result2 = Integer.parseInt(b + "" + a);
        
        answer = Math.max(result1, result2);
        
        return answer;
    }
}