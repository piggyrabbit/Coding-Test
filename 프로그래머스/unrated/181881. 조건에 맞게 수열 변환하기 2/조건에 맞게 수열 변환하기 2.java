import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        // 이전 단계 배열
        Arrays.sort(arr);
        
        int[] tmp = new int[arr.length];
        
        while(true) {
            
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) arr[i] /= 2;
                if (arr[i] % 2 == 1 && arr[i] < 50) arr[i] = arr[i] * 2 + 1;
            }
            
            Arrays.sort(arr);
            
            int cnt = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (tmp[i] == arr[i]) cnt++;
            }
            if (cnt == arr.length) break;
            
            
            answer++;
        }
        
        return answer;
    }
}