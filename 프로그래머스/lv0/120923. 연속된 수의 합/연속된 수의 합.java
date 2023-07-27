class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int cnt = -9999999;
        int tot = 0;
        
        while(true) {
            tot = 0;
            
            tot += num * cnt;
            
            for (int i = 0; i < num; i++) {
                tot += i;
            }
            
            if (tot == total) break;
            
            cnt++;
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = cnt + i;
        }
        
        return answer;
    }
}