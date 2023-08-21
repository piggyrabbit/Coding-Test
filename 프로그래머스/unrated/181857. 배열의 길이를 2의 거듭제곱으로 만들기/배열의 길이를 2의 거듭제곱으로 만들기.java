class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int cnt = 0;
        
        int num = arr.length;
        
        while(true) {
            
            if (num == 1) {
                cnt = -1;
                break;
            }
            
            if (Math.pow(2, cnt) < num &&
               Math.pow(2, cnt+1) >= num) {
                break;
            }
            cnt++;
        }
        
        cnt++;
        
        System.out.println(cnt);
        
        answer = new int[(int)Math.pow(2, cnt)];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}