class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = 0;
        int maxIdx = -1;
        
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
                maxIdx = i;
            }
        }
        
        int total = 0;
        
        for (int i = 0; i < sides.length; i++) {
            if (i != maxIdx) total += sides[i];
        }
        
        if (total > max) answer = 1;
        else answer = 2;
        
        return answer;
    }
}