class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int cnt = 1;
        int num = 1;
        while(n != cnt) {
            cnt++;
            num++;
            
            if (num % 3 == 0 || (num+"").contains("3")) {
                while(num % 3 == 0 || (num+"").contains("3")) {
                    num++;
                }
            }
            
        }
        
        return num;
    }
}