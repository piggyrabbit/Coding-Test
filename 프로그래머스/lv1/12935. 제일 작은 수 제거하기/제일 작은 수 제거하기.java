class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[arr.length - 1];
            
            int min = 9999999;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
            }
            
            int cnt = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
            
        }
        
        
        
        return answer;
    }
}