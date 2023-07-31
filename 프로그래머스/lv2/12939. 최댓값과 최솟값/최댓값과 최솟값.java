class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        int min = 999999;
        int max = -999999;
        for (int i = 0; i < arr.length; i++) {
            int cnt = Integer.parseInt(arr[i]);
            if (cnt < min) min = cnt;
            if (cnt > max) max = cnt;
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}