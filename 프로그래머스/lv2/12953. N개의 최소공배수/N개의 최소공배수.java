class Solution {
    public long solution(int[] arr) {
        long answer = 0;
        
        long total = 1;
        
        for (int i = 0; i < arr.length; i++) {
            total *= arr[i];    
        }
        
        for (int i = 1; i <= total; i++) {
            int cnt = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (i % arr[j] == 0) cnt++;     
            }
            
            if (cnt == arr.length) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}