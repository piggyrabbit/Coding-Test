class Solution {
    public long solution(int balls, int share) {
        double  answer = 1.0;
        
        // n! / (k! (n-k)!)
        
        if (share == balls) return 1;
        
        for (int i = 1; i <= balls; i++) {
            answer *= i;
        }
        
        for (int i = 1; i <= share; i++) {
            answer /= i;
        }
        
        for (int i = 1; i <= balls-share; i++) {
            answer /= i;
        }
        
        return Math.round(answer);
    }
}