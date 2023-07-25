class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int max = 1;
        
        for (int i = 1; i < a + b; i++) {
            if (a % i == 0 && b % i == 0) max = i;
        }
        
        a = a / max;
        b = b / max;
        
        System.out.println(b);
        
        while(true) {
            if (b % 2 == 0) b = b / 2;
            if (b % 5 == 0) b = b / 5;
            
            if (b % 2 != 0 && b % 5 != 0) break;
            if (b == 1) break;
        }
        
        if (b == 1) return 1;
        else return 2;
    }
}